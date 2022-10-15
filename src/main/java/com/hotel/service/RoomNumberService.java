package com.hotel.service;

import java.util.List;

import com.hotel.entities.Room;
import com.hotel.entities.RoomNumber;

public interface RoomNumberService {
	
	public List<RoomNumber>getAllRoomNumber();
	
	public Room getRoomById(String id);
	
	
}
