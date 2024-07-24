package com.example.roommanagment.repository;

import com.example.roommanagment.entity.Booking;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    //List<Booking> findByuId(Integer Id);

}
