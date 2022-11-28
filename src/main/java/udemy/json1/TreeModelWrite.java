package udemy.json1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelWrite {
	
	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			JsonNode root = objectMapper.readTree(new File(ClassLoader.getSystemResource("mapJson.json").getFile()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
