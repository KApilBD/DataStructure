package com.app.kedb.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user", schema = "ke_db")
public class UserLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserLogin() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "user_id")
	//@Size(max = 20, min = 8, message = "{user.name.invalid}")
	//@NotEmpty(message="Please Enter your name")
	private String username;
	
	@Email(message = "please provide valid email")
	@NotEmpty(message = "please provide email address")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String fname;

	@Column(name = "last_name")
	private String lname;

	@Column(name = "user_status")
	private String status;

	@Column(name = "LANG")
	private String lang;

	@CreationTimestamp
	@Column(name = "date_created")
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	@Column(name = "date_updated")
	private LocalDateTime dateUpdated;
	
	@Column(name = "reset_token")
	private String resetToken;

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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLang() {
		return lang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public UserLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
