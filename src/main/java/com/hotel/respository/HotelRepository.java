package com.hotel.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

	
}
