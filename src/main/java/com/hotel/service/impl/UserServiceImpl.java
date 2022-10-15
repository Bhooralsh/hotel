package com.hotel.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entities.User;
import com.hotel.respository.UserRepository;
import com.hotel.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public Optional<User> getUserById(String id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		return user;
	}

}
