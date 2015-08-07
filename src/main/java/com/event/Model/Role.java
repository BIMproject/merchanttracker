package com.event.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity(name="role")
public class Role {
	
@Id
@GeneratedValue
private int role_id;
private String role;
@ManyToMany(mappedBy="roles")
private List<User> user;
public Role(){}

public Role(int role_id, String role, List<User> user) {
	super();
	this.role_id = role_id;
	this.role = role;
	this.user = user;
}
public int getRole_id() {
	return role_id;
}
public void setRole_id(int role_id) {
	this.role_id = role_id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}

}
