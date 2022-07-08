package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
//@Table(name="login")
public class User {
	@Id
	private String username; 
	private String email;
	private String password;
	private String userRole;
	
	public User() {
		
	}



	public User(String username, String email, String password, String userRole) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", userRole=" + userRole
				+ "]";
	}

	
	

}
