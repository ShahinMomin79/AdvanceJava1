package com.techno.SD;

import java.io.Serializable;

public class User implements Serializable {
	
	int id;
	String name;
	String email;
	String Username;
	String Password;
	
	public User(int id, String name, String email, String username, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.Username = username;
		this.Password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", Username=" + Username + ", Password="
				+ Password + "]";
	}
	
	
}
