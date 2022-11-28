package udemy.json1;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.model.udemyJson;

public class Serializer {
	public static void main(String[] args) {
		udemyJson udemyjson = new udemyJson();
		udemyjson.setId(1);
		udemyjson.setKey1("value1");
		udemyjson.setKey2("value2");
		udemyjson.setDate(new Date());
		
		ObjectMapper objectMapper =new ObjectMapper();
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyjson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
