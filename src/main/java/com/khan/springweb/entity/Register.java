package com.khan.springweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.khan.springweb.constant.AppConstant;


@Entity
@Table(name="user_info")
public class Register implements Serializable {
	@Id 
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contactNumber")
	private String contactNumber;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pinCode")
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
		return "Register [Name=" + Name + ", email=" + email + ", contactNumber=" + contactNumber + ", city=" + city
				+ ", country=" + country + ", pinCode=" + pinCode + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getContactNumber()=" + getContactNumber() + ", getCity()=" + getCity()
				+ ", getCountry()=" + getCountry() + ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
}
