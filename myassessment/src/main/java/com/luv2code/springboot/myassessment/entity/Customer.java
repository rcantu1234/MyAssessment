package com.luv2code.springboot.myassessment.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class Customer {

	// Class to set fields in DAO.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="image")
	private String image;
	
	@Column(name="place")
	private String place;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="trueorfalse")
	private String trueorfalse;
	
	@Column(name="falseortrue")
	private String falseortrue;
	
	@Column(name="origin")
	private String origin;
	
	public Customer() {};

	public Customer(String firstName, String lastName, String email, String gender, String image, String place,
			String amount, String trueorfalse, String falseortrue, String origin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.image = image;
		this.place = place;
		this.amount = amount;
		this.trueorfalse = trueorfalse;
		this.falseortrue = falseortrue;
		this.origin = origin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String isTrueorfalse() {
		return trueorfalse;
	}

	public void setTrueorfalse(String trueorfalse) {
		this.trueorfalse = trueorfalse;
	}

	public String isFalseortrue() {
		return falseortrue;
	}

	public void setFalseortrue(String falseortrue) {
		this.falseortrue = falseortrue;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", image=" + image + ", place=" + place + ", amount=" + amount
				+ ", trueorfalse=" + trueorfalse + ", falseortrue=" + falseortrue + ", origin=" + origin + "]";
	}
}
