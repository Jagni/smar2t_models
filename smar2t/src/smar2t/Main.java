package smar2t;

import java.io.File;
import java.io.IOException;
import smar2t.W3CMapper;
import w3c_td.core.Thing;

class ModelToJSON {
	
	public static void main(String[] args) throws IOException {
		
		W3CMapper w3cMapper = new W3CMapper();
		Thing thing1 = w3cMapper.read(new File("src/main/resources/tds/w3c/coap-lamp.json"));
		File outputFile = new File("src/main/resources/generated/tdrs/w3c/coap-lamp.json");
		outputFile.createNewFile();
		w3cMapper.convertToJSON(thing1, outputFile);
	}
	
}