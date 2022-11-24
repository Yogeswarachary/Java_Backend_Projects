package com.role_based_login.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Users_Authentication_table")
@Data
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userName;
	
	private String password;
	
	private boolean active;
	
	private String roles; //role_user, role_admin
}
