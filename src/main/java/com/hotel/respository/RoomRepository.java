package com.hotel.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entities.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,String> {

}
