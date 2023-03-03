package com.service;

import com.po.User;

public interface UserService {
	
	boolean login(User user);
	int register(User user);
	
}