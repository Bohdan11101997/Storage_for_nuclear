package com.Service;


import com.Entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
