package com.epg.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epg.apirest.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<User> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		
		List<User> users = theQuery.getResultList();
		
		return users;

	}

	@Override
	public User findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);

		User user = currentSession.get(User.class, id);
		
		return user;
	}

	@Override
	public User findByUser(String user) {
		Session currentSession = entityManager.unwrap(Session.class);

		User user1 = (User) currentSession.getEnabledFilter(user);
		
		return user1;
	}
	
	@Override
	public void save(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(user);	
		
	}

	@Override
	public void saveConnection(User user1, User user2) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(user1);	
		
	}

	
}
