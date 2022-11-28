package udemy.json1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.model.UdemyStudent;

public class DataBindingWrite {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper =new ObjectMapper();
		
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("thanu");
		udemyStudent.setLastname("hello");
		
		UdemyStudent udemyStudent2 = new UdemyStudent();
		udemyStudent2.setId(2);
		udemyStudent2.setName("shreyas");
		udemyStudent2.setLastname("ïyengar");
		
		try {
			System.out.println(objectMapper.writeValueAsString(udemyStudent));
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyStudent));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Object> mapJson = new LinkedHashMap<String,Object>();
		
		mapJson.put("Key1", "value2");
		mapJson.put("key2", "value2");
		mapJson.put("booleanTrue", true);
		mapJson.put("booleanFalse", false);
		mapJson.put("array", new String[] {"1","2","3","4"});
		mapJson.put("arrayObject", new UdemyStudent[] {udemyStudent,udemyStudent2});
		mapJson.put("nestedObject",udemyStudent);
		mapJson.put("Ïnterger", 1);
		mapJson.put("valueNull", null);
		mapJson.put("list",Arrays.asList("1","2","3"));
		mapJson.put("date", LocalDateTime.now().toString());
		
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/mapJson.json"), mapJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
