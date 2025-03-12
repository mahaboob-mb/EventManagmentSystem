package cts.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.ems.dto.User;
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
	
	public List<User> getAllUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}
	
	public Optional<User> getUserById(int userID) {
		return userRepository.findById(userID);
	}
	
}
