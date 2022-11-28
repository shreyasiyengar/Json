package udemy.json.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class UdemyjsonDeserializer extends  JsonDeserializer<udemyJson>{

	@Override
	public udemyJson deserialize(JsonParser jsonParser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		ObjectCodec codec =jsonParser.getCodec();
		JsonNode root= codec.readTree(jsonParser);
		
		udemyJson udemyjson = new udemyJson();
		udemyjson.setId(Long.valueOf(root.get("udemyjosn id").asText().replace("custom prefix", "")));
		udemyjson.setKey1(root.get("udemyjson key1").asText());
		udemyjson.setKey2(root.get("udemyjson key2").asText());
		
		return udemyjson;
	}

	
}
