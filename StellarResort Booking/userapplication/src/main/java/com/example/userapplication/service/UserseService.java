package com.example.userapplication.service;

import com.example.userapplication.entity.Userse;
import com.example.userapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserseService {


        @Autowired
        UserRepository userRepository;

        public Userse registerUser(Userse usersEntity) {
            return  userRepository.save(usersEntity);

        }


        public void deleteUser(Integer id)
        {
            userRepository.deleteById(id);
            System.out.println("delete succesfullyy !");
        }
        public List<Userse> getUsers(){
            return userRepository.findAll();
        }
        public Userse updateUser(Userse usersEntity){
            return userRepository.save(usersEntity);
        }


        public Optional<Userse> getUserById(Integer id) {
            return userRepository.findById(id);
        }
    }


