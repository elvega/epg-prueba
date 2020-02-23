package com.epg.apirest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user")
	private String user;
	
	@Column(name="user_connection")
	private String UserConnection;
	

	public User() {}
	
	public User(int id, String user, String UserConnection) {
		this.id = id;
		this.user = user;
		this.UserConnection = UserConnection;
		//this.setUserConnection(UserConnection);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getIdUserConnection() {
		return UserConnection;
	}

	public void setUserConnection(String UserConnection) {
		this.UserConnection = UserConnection;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", UserConnection=" + UserConnection +"]";
	}


	
	
}