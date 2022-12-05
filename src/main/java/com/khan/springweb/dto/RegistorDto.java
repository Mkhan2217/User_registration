package com.khan.springweb.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RegistorDto implements Serializable {
	private String Name;
	private String email;
	private String contactNumber;
	private String city;
	private String country;
	private String pinCode;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "RegistorDto [Name=" + Name + ", email=" + email + ", contactNumber=" + contactNumber + ", city=" + city
				+ ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
	 
	

}
