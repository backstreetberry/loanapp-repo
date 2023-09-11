package com.example.loanapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	@Id
//	@GeneratedId
	@Column(name="user_id")
	private int id;
	
	@Column(length=30, nullable=false, unique=true)
	private String username;
	
	@Column(length=10, nullable=false)
	private String password;
	
	@Column(length=30, nullable=false)
	private String designation;
	
	@Column(length=20, nullable=false)
	private String department;
	
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<UserCard> userCard;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUsername() {
		return username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
