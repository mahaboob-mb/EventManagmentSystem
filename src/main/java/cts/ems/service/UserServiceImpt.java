package cts.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.ems.entity.User;
import cts.ems.repository.UserRepository;

@Service
public class UserServiceImpt implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User userRegistration(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}
	
	public User login(User user) {
		String email = user.getEmail();
		User us = userRepository.findUserByEmail(email);
		return us;
	}
}
