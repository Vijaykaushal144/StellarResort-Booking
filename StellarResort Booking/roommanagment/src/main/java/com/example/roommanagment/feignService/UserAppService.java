package com.example.roommanagment.feignService;


import com.example.roommanagment.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("USERAPPLICATION")
public interface UserAppService {
    @GetMapping("/users/getuserById/{uid}")
    public UserDTO getUserById(@PathVariable Integer uid);



}
