package com.example.userapplication.repository;

import com.example.userapplication.entity.Userse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Userse,Integer> {
}
