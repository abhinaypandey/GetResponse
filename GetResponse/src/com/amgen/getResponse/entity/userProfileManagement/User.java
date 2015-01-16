package com.amgen.getResponse.entity.userProfileManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.log4j.Logger;

import com.amgen.getResponse.utility.GetResponseLog;
import com.amgen.getResponse.utility.GetResponseLoggerFactory;

@Entity
@Table(name="USER")

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="USER_AUTO")
	@SequenceGenerator(name="USER_AUTO", sequenceName="USER_AUTO", allocationSize=1)
	@Column(name = "USER_ID")
	
private int id;
	
	@Column(name="First_Name")
    private String first_name;
	
	@Column(name="Last_Name")
    private String last_name;
	
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private long phone;

	

	public User() {
		
	}
	
	public int getId() {
		 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
		}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		
		this.phone = phone;
	}
	
	
	
}
