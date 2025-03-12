package cts.ems.service;
import java.util.List;
import java.util.Optional;

import cts.ems.dto.User;

public interface UserService {
	
	public User userRegistration(User user);
	public User login(User user);
	public List<User> getAllUsers();
	public Optional<User> getUserById(int userID);
	
}
