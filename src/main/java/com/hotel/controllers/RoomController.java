package com.hotel.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Room;
import com.hotel.service.RoomService;

@RestController
@RequestMapping("/api/v1")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/room")
	public List<Room> getAllRoom() {

		List<Room> list = roomService.getAllRoom();
		return list;
	}

	@GetMapping("/room/{id}")
	public Optional<Room> getRoomById(@PathVariable("id") String id) {
		Optional<Room> room = roomService.getRoomById(id);
		return room;
	}

}
