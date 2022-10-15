package com.hotel.service;

import java.util.List;
import java.util.Optional;

import com.hotel.entities.Hotel;

public interface HotelService {

	List<Hotel> getAllHotel();

	Optional<Hotel> getHotelById(String id);

	List<Hotel> getAllBySort(String id);
}
