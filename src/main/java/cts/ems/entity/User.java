package cts.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private int userID;
	private String name;
	private String email;
	private String password;
	private long contactNumber;
	
//	public User(int userID, String name, String email, String password, long contactNumber) {
//		super();
//		this.userID = userID;
//		this.name = name;
//		this.email = email;
//		this.password = password;
//		this.contactNumber = contactNumber;
//	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", getUserID()=" + getUserID() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getContactNumber()="
				+ getContactNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}


}
