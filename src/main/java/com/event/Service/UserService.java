package com.event.Service;

import java.util.List;

import com.event.Model.User;

public interface UserService {


	public void add(User user);

	public void edit(User user);
	

	public void delete(Integer user_id);

	public User getUser(Integer user_id);

	public List<User> getAllUser();
	public User findByUsername(String username);
}
