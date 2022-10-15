package com.hotel.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entities.Room;
import com.hotel.respository.RoomRepository;
import com.hotel.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public List<Room> getAllRoom() {

		List<Room> rooms = roomRepository.findAll();
		return rooms;
	}

	@Override
	public Optional<Room> getRoomById(String id) {
		// TODO Auto-generated method stub
			Optional<Room> room = roomRepository.findById(id);
		return room;
	}

}
