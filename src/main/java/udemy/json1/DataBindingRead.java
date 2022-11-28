package udemy.json1;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.model.UdemyStudent;

public class DataBindingRead {
	
	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String udemyStudentJson = "{"+
		"\"id\" :1,"+
				"\"name\" : \"shreyas\","+
		"\"lastname\" : \"iyengar\"" +
				
				"}";
		
		try {
			UdemyStudent udemyStudent=objectMapper.readValue(udemyStudentJson, UdemyStudent.class);
			
			System.out.println("id: "+ udemyStudent.getId());
			System.out.println("name: "+ udemyStudent.getName());
			System.out.println("lastname: "+ udemyStudent.getLastname());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		ClassLoader classLoader = DataBindingRead.class.getClassLoader();
		
		try {
			Map<String, Object> mapJSON=objectMapper.readValue(ClassLoader.getSystemResource("mapJson.json"),
							new TypeReference<Map<String,Object>>(){}
			);
			System.out.println(mapJSON);
			
			for(Map.Entry<String, Object> entry: mapJSON.entrySet()) {
				System.out.println("key: "+entry.getValue() + " value :" +entry.getValue());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
