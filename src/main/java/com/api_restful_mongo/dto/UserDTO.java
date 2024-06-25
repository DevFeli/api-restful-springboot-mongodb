package com.api_restful_mongo.dto;

import java.io.Serializable;

import com.api_restful_mongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String email;
	private String name;
	
	public UserDTO() {}

	public UserDTO(User obj) {
		id = obj.getId();
		email = obj.getEmail();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
