package com.hotel.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/api/v1")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/hotel/")
	public List<Hotel> getAllHotels() {

		List<Hotel> hotels = hotelService.getAllHotel();
		return hotels;
	}

	@GetMapping("/hotel/{id}")
	public Optional<Hotel> getHotelById(@PathVariable String id) {
		Optional<Hotel> hotel = hotelService.getHotelById(id);
		return hotel;
	}

	@GetMapping("/id")
	public List<Hotel> getAllHotelTheSort(@RequestParam(value = "sort", required = false) String asc) {
		List<Hotel> allHotel = hotelService.getAllBySort(asc);
		return allHotel;
	}
}
