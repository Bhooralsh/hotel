package com.hotel.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Room;
import com.hotel.entities.User;
import com.hotel.respository.UserRepository;
import com.hotel.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService useService;

	@GetMapping("/user")
	public List<User> getAllUser() {
		List<User> list = useService.getAllUser();
		return list;
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable String id) {
		Optional<User> user = useService.getUserById(id);

		return user;
	}
	
	@GetMapping("/user/")
	public List<User> getAllUserTheSort(@RequestParam(value = "sort", required = false) String asc) {
		List<User> allUser = useService.getAllUserBySort(asc);	
		return allUser;
	}

}
