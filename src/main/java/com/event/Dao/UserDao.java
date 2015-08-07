package com.event.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.event.Model.User;
@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
	
	public User findByUsername(String username);        
 
}
