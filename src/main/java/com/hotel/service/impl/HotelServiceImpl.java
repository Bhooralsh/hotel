package com.hotel.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hotel.entities.Hotel;
import com.hotel.respository.HotelRepository;
import com.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public List<Hotel> getAllHotel() {
		
		int pageNo=0;
		int pageSize=50;
	//	Pageable p = PageRequest.of(pageNo,pageSize,Sort.by(sortBy));
		List<Hotel>hotels=	hotelRepository.findAll();
		return hotels;
	}

	@Override
	public Optional<Hotel> getHotelById(String id) {
		// TODO Auto-generated method stub
		Optional<Hotel> hotel= hotelRepository.findById(id);
		return hotel;
	}

	@Override
	public List<Hotel> getAllBySort(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findAll(Sort.by(Sort.Direction.DESC,id));
	}

	

}
