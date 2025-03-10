package cts.ems.service;
import cts.ems.entity.User;

public interface UserService {
	
	public User userRegistration(User user);
	public User login(User user);
}
