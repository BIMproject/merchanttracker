package com.event.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


public class UserDetailsRetrival implements
		org.springframework.security.core.userdetails.UserDetails {

	private static final long serialVersionUID = 1L;

	private final User user;

	public UserDetailsRetrival(User user) {
		this.user = user;

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		for (Role role : user.getRoles()) {
			authorities.add( new SimpleGrantedAuthority(role.getRole()));
		}
		return authorities;
	}

	@Override
	public String getPassword() {

		return user.getPassword();
	}

	@Override
	public String getUsername() {

		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {

		return user.getStatus().equals(UserStatus.ACTIVE);
	}

	@Override
	public boolean isAccountNonLocked() {

		return user.getStatus().equals(UserStatus.ACTIVE);
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return user.getStatus().equals(UserStatus.ACTIVE);
	}

	@Override
	public boolean isEnabled() {

		return user.getStatus().equals(UserStatus.ACTIVE);
	}

}
