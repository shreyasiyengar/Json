package udemy.json.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class udemyJsonSerializer extends JsonSerializer<udemyJson>{

	@Override
	public void serialize(udemyJson udemyJson, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
				
		jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
		
		jsonGenerator.writeStartObject();
		
		jsonGenerator.writeFieldName("custom serialize");
		jsonGenerator.writeString("udemy josn");
		
		jsonGenerator.writeStringField("udemyjson id","custom prefix"+udemyJson.getId());
		jsonGenerator.writeStringField("udemyjson key1","custom prefix"+udemyJson.getKey1());
		jsonGenerator.writeStringField("udemyjson key2","custom prefix"+udemyJson.getKey2());
		jsonGenerator.writeStringField("udemyjson date","custom prefix"+udemyJson.getDate());
		
		
	}

	
}
