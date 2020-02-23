package com.epg.apirest.service;

import java.util.List;

import com.epg.apirest.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findByConnection(int id);
	
	public User findUserByConnection(String userConnection);

	public void addUser(User user);
	
	public void addUserToUser(User user);

	
}
