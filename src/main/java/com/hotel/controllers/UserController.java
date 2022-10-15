package com.hotel.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.User;
import com.hotel.respository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	public List<User> getAllUser() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable String id) {
		Optional<User> user = userRepository.findById(id);

		return user;
	}

}
