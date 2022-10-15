package com.hotel.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entities.RoomNumber;

@Repository
public interface RoomNumberRepository extends JpaRepository<RoomNumber,String> {

}
