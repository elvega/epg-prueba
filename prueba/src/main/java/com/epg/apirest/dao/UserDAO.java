package com.epg.apirest.dao;

import java.util.List;

import com.epg.apirest.entity.User;


public interface UserDAO {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save(User user);
	
	public void saveConnection(User user1, User user2);

	
}