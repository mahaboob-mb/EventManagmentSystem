package cts.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cts.ems.entity.User;
import cts.ems.service.UserService;

@RestController
@RequestMapping("/user-api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User userRegistration(@RequestBody User user) {
		User user1 = userService.userRegistration(user);
		return user1;
	}
	
	@GetMapping("/login")
	public User login(@PathVariable String email, @PathVariable String password) {
		User user = null;
		user.setEmail(email);
		user.setPassword(password);
		User msg = userService.login(user);
		return msg;
	}

}
