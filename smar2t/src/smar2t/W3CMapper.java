package smar2t;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import smar2t.td.w3c.core.CoreFactory;
import smar2t.td.w3c.core.Thing;
import smar2t.td.w3c.hypermediacontrols.HypermediacontrolsFactory;
import smar2t.td.w3c.hypermediacontrols.Link;

public class W3CMapper {
	ObjectMapper mapper;
	
	ResourceSet resourceSet;
	Resource resource;
	
	W3CMapper(){
		setupResourceSet();
		setupMapper();
		setupResource();
		
		Thing thing = CoreFactory.eINSTANCE.createThing();
		thing.setTitle("Lamp");

		Link link = HypermediacontrolsFactory.eINSTANCE.createLink();
		link.setHref("teste.com");
		
		thing.getLinks().add(link);

		resource.getContents().add(thing);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void convertToJSON(Thing thing, File file) {		
		try {
			mapper.writer()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(Thing.class)
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
	
	public Thing read(File file) {
		try {
			Thing thing = mapper.reader()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(Thing.class)
			.readValue(file);
			return thing;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Thing read(String json) {
		try {
			Thing thing = mapper.reader()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(Thing.class)
			.readValue(json);
			return thing;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private void setupResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	}
	
	private void setupResource(){
		resource = resourceSet.createResource(URI.createFileURI("src/main/resources/setup/w3c.json"));
	}
	
	public void setupMapper(){
		mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		mapper.registerModule(module);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	}
}
