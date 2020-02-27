package smar2t;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import thing_ui.Location;
import thing_ui.ThingUI;
import thing_ui.Thing_uiFactory;

public class ThingUIMapper {
ObjectMapper mapper;
	
	ResourceSet resourceSet;
	Resource resource;
	
	ThingUIMapper(){
		setupResourceSet();
		setupMapper();
		setupResource();
		
		ThingUI ui = Thing_uiFactory.eINSTANCE.createThingUI();
		ui.setName("Lamp");

		Location location = Thing_uiFactory.eINSTANCE.createLocation();
		location.setAltitude(1);
		
		ui.setLocation(location);

		resource.getContents().add(ui);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ThingUI read(File file) {
		try {
			ThingUI thing = mapper.reader()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(ThingUI.class)
			.readValue(file);
			return thing;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ThingUI read(String json) {
		try {
			ThingUI thing = mapper.reader()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(ThingUI.class)
			.readValue(json);
			return thing;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ThingUI readXMI(String filepath) {
		try {
			Resource res = resourceSet.getResource(URI.createFileURI(filepath), true);
			res.load(null);
			return (ThingUI) res.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void convertToJSON(ThingUI thing, String filepath) {		
		try {
			File file = new File(filepath);
			file.delete();
			file.createNewFile();
			mapper.writer()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(ThingUI.class)
			.writeValue(file, thing);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void convertToXMI(ThingUI thing, String filepath) {
		
		try {
			Resource res = resourceSet.createResource(URI.createFileURI(filepath));
			res.getContents().add(thing);
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void setupResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}
	
	private void setupResource(){
		resource = resourceSet.createResource(URI.createFileURI("src/main/resources/setup/tdui.json"));
	}
	
	public void setupMapper(){
		mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		mapper.registerModule(module);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	}
}

