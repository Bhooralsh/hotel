package com.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String id;
	private String username;
	private String email;
	private String country;
	private String img;
	private String city;
	private String phone;
	private boolean isAdmin;
	
	
	public User() {
		super();
	}


	public User(String id, String username, String email, String country, String img, String city, String phone,
			boolean isAdmin) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.country = country;
		this.img = img;
		this.city = city;
		this.phone = phone;
		this.isAdmin = isAdmin;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public boolean isAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", country=" + country + ", img="
				+ img + ", city=" + city + ", phone=" + phone + ", isAdmin=" + isAdmin + "]";
	}
	
	
	
	
	
}
