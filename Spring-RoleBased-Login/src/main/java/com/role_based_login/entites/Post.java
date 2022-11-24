package com.role_based_login.entites;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Posts")
@Data
public class Post {
	
	@Id
	@GeneratedValue
	private int postId;
	
	private String subject;
	
	private String Description;
	
	private String userName;
	
	@Enumerated(EnumType.STRING)
	private PostStatus status;
}
