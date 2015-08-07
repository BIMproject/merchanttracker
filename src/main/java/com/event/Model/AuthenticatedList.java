package com.event.Model;

import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticatedList {

	public static org.springframework.security.core.userdetails.UserDetails getcurrentuser(){
		Object principal=SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    
	    if (principal instanceof org.springframework.security.core.userdetails.UserDetails) {
	      String username=((org.springframework.security.core.userdetails.UserDetails)principal).getUsername();
	        
	        return principal instanceof org.springframework.security.core.userdetails.UserDetails ? ((org.springframework.security.core.userdetails.UserDetails) principal) : null;
	    }
	    return null;
	}
	
}
