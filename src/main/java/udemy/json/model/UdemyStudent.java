package udemy.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UdemyStudent {
	
	//@JsonProperty("udemyid") //sample Jsonannoatation example 
	private long id;
	private String name;
	private String lastname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
