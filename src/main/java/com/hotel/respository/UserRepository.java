package com.hotel.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

}
