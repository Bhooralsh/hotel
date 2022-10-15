package com.hotel.service;

import java.util.List;
import java.util.Optional;

import com.hotel.entities.User;

public interface UserService {

	List<User>getAllUser();
	
	Optional<User> getUserById(String id);
}

