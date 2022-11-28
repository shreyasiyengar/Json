package udemy.json1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.model.udemyJson;

public class Deserializer {
	public static void main(String[] args) {
		
		ClassLoader classLoader = Deserializer.class.getClassLoader();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			udemyJson udemyjson = objectMapper.readValue(new File(classLoader.getResource("udemyjosn.json").getFile()),udemyJson.class);
		
			System.out.println(" id : "+udemyjson.getId());
			System.out.println(" key1 :" +udemyjson.getKey1());
			System.out.println("key 2: "+udemyjson.getKey2());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
