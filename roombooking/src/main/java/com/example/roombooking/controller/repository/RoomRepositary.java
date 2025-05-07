package com.example.roombooking.repository;

import com.example.roombooking.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extend MongoRepository<Room, String> {
    
}