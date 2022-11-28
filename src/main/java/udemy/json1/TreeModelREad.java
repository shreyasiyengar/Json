package udemy.json1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelREad {
	
	public static void main(String[] args) {
		
		ClassLoader classLoader = TreeModelREad.class.getClassLoader();
		ObjectMapper objectMapper =new ObjectMapper();
	
		try {
			
			JsonNode root = objectMapper.readTree(new File(classLoader.getResource("mapJson.json").getFile()));
			
			JsonNode key1Node=root.get("key1");
			String key1Value = key1Node.asText();
			System.out.println("Key1: " +key1Value);
			
			JsonNode key2Node = root.get("Key2");
			String key2Value = key2Node.asText();
			System.out.println("key2: "+key2Value);
		
			JsonNode booleanTrue = root.get("booleanTrue");
			String booleanTruevalue = booleanTrue.asText();
			System.out.println("booleanTrue "+ booleanTruevalue);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
