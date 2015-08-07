package com.event.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.event.Service.UserService;
@Service
public class UserDetailsImpl implements UserDetailsService {
	@Autowired
	private UserService userService;
	

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
	
		User user=userService.findByUsername(username);
		if(user!=null){
			
			return new UserDetailsRetrival(user);
			
		}else{
			throw new UsernameNotFoundException("user not found");
		
		}
		
	
	
	}

}
