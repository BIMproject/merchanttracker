package com.event.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.event.Model.User;
import com.event.Service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	
	
	@RequestMapping("/user")
	public String listUsers(Map<String, Object> map) {
		User user = new User();
		map.put("user", user);
		return "user";
	}

	@RequestMapping(value = "/user.do", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User users,
			BindingResult result, Model model) {

		userService.add(users);

		model.addAttribute("userList", userService.getAllUser());
		return "userlist";

	}

	@RequestMapping(value = "/edit/{user_id}", method = RequestMethod.POST)
	public String editUser(@ModelAttribute("user") User users, Model model,
			@PathVariable("user_id") String id) {
		users.setUser_id(Integer.parseInt(id));
		userService.edit(users);

		model.addAttribute("userList", userService.getAllUser());
		return "userlist";
	}

	@RequestMapping("/delete/{user_id}")
	public String delete(@PathVariable("user_id") int user_id, Model model) {

		userService.delete(user_id);
		model.addAttribute("userList", this.userService.getAllUser());

		return "userlist";
	}

	@RequestMapping("/edit/{user_id}")
	public String editUser(@PathVariable("user_id") int user_id, Model model) {

		model.addAttribute("user", this.userService.getUser(user_id));

		model.addAttribute("userList", this.userService.getAllUser());
		return "editUser";
	}

	@RequestMapping("/listing")
	public String lists(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("userList", this.userService.getAllUser());

		return "userlist";
	}

}
