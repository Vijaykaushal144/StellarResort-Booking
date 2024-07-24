package com.example.roommanagment.feignService;

import com.example.roommanagment.dto.RoomDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ROOMBOOKING")
public interface RoomAppService {
    @GetMapping("/roombooking/getRoomById/{roomId}")
    public RoomDTO getRoomById(@PathVariable("roomId") Integer roomId);

}
