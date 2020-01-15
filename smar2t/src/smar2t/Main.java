package smar2t;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import smar2t.td.w3c.core.*;
import smar2t.td.w3c.hypermediacontrols.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;

class ModelToJSON {
	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		ObjectMapper mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		mapper.registerModule(module);
		Resource resource = resourceSet.createResource(URI.createFileURI("src/main/resources/data.json"));
		Resource sampleResource = resourceSet.createResource(URI.createFileURI("src/main/resources/data.json"));

		
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

		var thing1 = mapper.reader()
		.withAttribute(EMFContext.Attributes.RESOURCE, resource)
		.forType(Thing.class)
		.readValue(new File("src/main/resources/sample.json"));
		
		System.out.println(thing1.toString());
	}
}