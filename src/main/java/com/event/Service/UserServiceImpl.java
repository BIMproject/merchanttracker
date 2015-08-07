package com.event.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.Dao.UserDao;
import com.event.Model.User;
import com.google.common.collect.Iterables;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao repository;

	public void delete(Integer user_id) {
		repository.delete(user_id);

	}

	public User getUser(Integer user_id) {
		return repository.findOne(user_id);
	}

	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		Iterables.addAll(list, repository.findAll());
		return list;

	}

	public void add(User user) {
		repository.save(user);

	}

	public void edit(User user) {

		User updateUser = repository.findOne(user.getUser_id());
		updateUser.setUsername(user.getUsername());
		updateUser.setposition(user.getposition());
		updateUser.setPassword(user.getPassword());
		updateUser.setCreated_date(user.getCreated_date());
		updateUser.setEmail(user.getEmail());
		repository.save(updateUser);
	}

	public User findByUsername(String username) {

		return repository.findByUsername(username);
	}

	
		
	}


