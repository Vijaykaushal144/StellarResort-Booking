package com.example.roombooking.controller;


import com.example.roombooking.entity.Room;
import com.example.roombooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roombooking")
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping("/createroom")
    public Room createRoom(@RequestBody Room room) {
       return roomService.createRoom(room);
    }
    @GetMapping("/getAllRooms")
    public List<Room> getRooms()
    {
        return roomService.getAllRooms();
    }

    @GetMapping("/getRoomById/{Id}")
    public Optional<Room> getRoomById(@PathVariable int Id){
        return roomService.getRoomById(Id);
    }

    @DeleteMapping("/deleteRoom/{id}")
    public String deleteRoom(@PathVariable Integer id) {
        return roomService.removeRoomById(id);
       // System.out.println("Room Deleted Successfully!");
    }

    @PutMapping("/updateRoom/{id}")
    public Room updateRoom(@PathVariable Integer id, @RequestBody Room room) {
        room.setrId(id);
        return roomService.updateRoom(room);
    }
}
