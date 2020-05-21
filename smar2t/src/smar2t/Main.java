package smar2t;

import java.io.File;
import java.io.IOException;
import thing_ui.ThingUI;
import w3c_td.Thing;

class ModelToJSON {
	public final static String TRANSFORMATION_DIR = "./model/transformations/";

	public final static String OUT_METAMODEL = "./model/ThingUI/ThingUI.ecore";
	public final static String OUT_METAMODEL_NAME = "ThingUI";
			
	public static void main(String[] args) throws IOException {
		transformMozillaESP32Led();
		readGeneratedMozillaTDUI();
	}
	
	public static void transformW3CCoapLamp() {
		
		W3CMapper w3cMapper = new W3CMapper();
		Thing thing1 = w3cMapper.read(new File("src/main/resources/tds/w3c/coap-lamp.json"));
		
		String outputJSON = "src/main/resources/generated/tdrs/w3c/coap-lamp.json";
		w3cMapper.convertToJSON(thing1, outputJSON);
		
		String outputXMI = "src/main/resources/generated/xmis/w3c/coap-lamp.xmi";
		w3cMapper.convertToXMI(thing1, outputXMI);

		ATLauncher atlauncher = new ATLauncher();
		
		String inMetamodel = "./model/W3CTD/W3CTD.ecore";
		String inMetamodelName = "W3CTD";
		atlauncher.registerInputMetamodel(inMetamodel, inMetamodelName);
		atlauncher.registerOutputMetamodel(OUT_METAMODEL, OUT_METAMODEL_NAME);
		atlauncher.transformationDir = TRANSFORMATION_DIR;
		atlauncher.transformationModule = "W3CTD2ThingUI";
		
		String w3cTDUIPath = "src/main/resources/generated/xmis/w3c/esp32.xmi";
		atlauncher.transform(outputXMI, w3cTDUIPath);
		
	}
	
	public static void transformMozillaESP32Led() {
		MozillaMapper mapper = new MozillaMapper();
		mozilla_td.Thing thing1 = mapper.read(new File("src/main/resources/tds/mozilla/esp32.json"));
		String outputJSON = "src/main/resources/generated/tdrs/mozilla/esp32.json";
		mapper.convertToJSON(thing1, outputJSON);
		
		String mozillaXMIPath = "src/main/resources/generated/xmis/mozilla/esp32.xmi";
		mapper.convertToXMI(thing1, mozillaXMIPath);

		ATLauncher atlauncher = new ATLauncher();
		
		atlauncher.registerInputMetamodel("./model/MozillaTD/MozillaTD.ecore", "MozillaTD");
		atlauncher.registerOutputMetamodel(OUT_METAMODEL, OUT_METAMODEL_NAME);
		atlauncher.transformationDir = TRANSFORMATION_DIR;
		atlauncher.transformationModule = "MozillaTD2ThingUI";
				
		String mozillaTDUIPath = "src/main/resources/generated/tduis/mozilla/esp32.xmi";
		atlauncher.transform(mozillaXMIPath, mozillaTDUIPath);
		
	}
	
	public static void readGeneratedMozillaTDUI() {
		ThingUIMapper mapper = new ThingUIMapper();
		ThingUI ui = mapper.readXMI("src/main/resources/generated/tduis/mozilla/esp32.xmi");
		
		String outputJSON = "src/main/resources/generated/tduis/mozilla/esp32.json";
		mapper.convertToJSON(ui, outputJSON);
	}
}