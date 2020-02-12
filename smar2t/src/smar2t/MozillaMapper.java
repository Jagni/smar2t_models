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

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import smar2t.td.mozilla.core.CoreFactory;
import smar2t.td.mozilla.core.Thing;
import smar2t.td.mozilla.core.Link;


public class MozillaMapper {
	ObjectMapper mapper;
	
	ResourceSet resourceSet;
	Resource resource;
	
	MozillaMapper(){
		setupResourceSet();
		setupMapper();
		setupResource();
		
		Thing thing = CoreFactory.eINSTANCE.createThing();
		thing.setTitle("Lamp");

		Link link = CoreFactory.eINSTANCE.createLink();
		link.setHref("teste.com");
		
		thing.getLinks().add(link);

		resource.getContents().add(thing);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Thing read(File file) {
		try {
			Thing thing = mapper.reader()
			.withAttribute(EMFContext.Attributes.RESOURCE, resource)
			.forType(Thing.class)
			.readValue(new File("src/main/resources/sample.json"));
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
		resource = resourceSet.createResource(URI.createFileURI("src/main/resources/setup/mozilla.json"));
	}
	
	public void setupMapper(){
		mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		mapper.registerModule(module);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	}
}
