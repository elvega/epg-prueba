package com.epg.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epg.apirest.dao.UserDAO;
import com.epg.apirest.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> findAll() {
		List<User> listUsers= userDAO.findAll();
		return listUsers;
	}

	@Override
	public User findByConnection(int id) {
		User user = userDAO.findById(id);
		return user;
	}

	@Override
	public void addUser(User user) {
		userDAO.save(user);

	}

	@Override
	public void addUserToUser(User user) {
		userDAO.save(user);
		


	}

}