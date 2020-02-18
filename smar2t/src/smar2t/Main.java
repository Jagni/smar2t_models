package smar2t;

import java.io.File;
import java.io.IOException;

import org.eclipse.m2m.atl.emftvm.Model;

import smar2t.W3CMapper;
import w3c_td.core.Thing;

class ModelToJSON {
	
	public final static String IN_METAMODEL = "./model/W3CTD/W3CTD.ecore";
	public final static String IN_METAMODEL_NAME = "W3CTD";
	public final static String OUT_METAMODEL = "./model/ThingUI/ThingUI.ecore";
	public final static String OUT_METAMODEL_NAME = "ThingUI";
		
	public final static String TRANSFORMATION_DIR = "./model/transformations/";
	public final static String TRANSFORMATION_MODULE= "W3CTD2ThingUI";
	
	public static void main(String[] args) throws IOException {
		
		W3CMapper w3cMapper = new W3CMapper();
		Thing thing1 = w3cMapper.read(new File("src/main/resources/tds/w3c/coap-lamp.json"));
		
		String outputJSON = "src/main/resources/generated/tdrs/w3c/coap-lamp.json";
		w3cMapper.convertToJSON(thing1, outputJSON);
		
		String outputXMI = "src/main/resources/generated/xmis/w3c/coap-lamp.xmi";
		w3cMapper.convertToXMI(thing1, outputXMI);

		ATLauncher atlauncher = new ATLauncher();
		atlauncher.registerInputMetamodel(IN_METAMODEL, IN_METAMODEL_NAME);
		atlauncher.registerOutputMetamodel(OUT_METAMODEL, OUT_METAMODEL_NAME);
		Model result = atlauncher.w3c2ui(outputXMI, TRANSFORMATION_DIR, TRANSFORMATION_MODULE);
		
		System.out.println(result);
	}
	
}