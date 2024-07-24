package com.example.roombooking.repository;

import com.example.roombooking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
