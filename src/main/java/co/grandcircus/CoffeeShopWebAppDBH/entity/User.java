package co.grandcircus.CoffeeShopWebAppDBH.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity // This maps the User class to a table
@NamedQuery(name="find_all_user", query="select u from User u")
public class User {
	
	// Instance variables for User class	
	@Id // This refers to the primary key for Hibernate
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Lets MySQL generate and auto-increment the package
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer phone;
	private String password;

	// Created using Generate Constructors from Superclass
	public User() {
	}
	
	// Created by using Generate Constructor using Fields
	public User(Integer id, String firstName, String lastName, String email, Integer phone, String password) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;

	}

	//Overloaded constructor
	public User(String firstName, String lastName, String email, Integer phone, String password) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;

	}


	// Created from Generate Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Created from Generate toString()
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}

}
