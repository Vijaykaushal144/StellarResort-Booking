package com.example.roombooking.service;


import com.example.roombooking.entity.Room;
import com.example.roombooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Integer id) {
        return roomRepository.findById(id);
    }



    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    public String removeRoomById(Integer id) {
        roomRepository.deleteById(id);
       return "Removed room Successfully!";
    }

}
