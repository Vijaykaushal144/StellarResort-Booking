package com.example.roommanagment.controller;


import com.example.roommanagment.dto.BookingDTO;
import com.example.roommanagment.dto.RoomDTO;
import com.example.roommanagment.dto.UserDTO;
import com.example.roommanagment.entity.Booking;
import com.example.roommanagment.feignService.RoomAppService;
import com.example.roommanagment.feignService.UserAppService;
import com.example.roommanagment.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/roommanagment")
public class BookingController {

    @Autowired
    BookingService bookingService;
    @Autowired
    RoomAppService roomClient;
    @Autowired
    UserAppService userClient;

    @PostMapping("/createBooking")
    public String createBooking(@RequestBody BookingDTO bookingdto) {
         bookingService.createBooking(bookingdto);
         return "Booking Created";
    }


   @GetMapping("/getallRoom/{bId}")
    public Optional<BookingDTO> getallBookingByUID(@PathVariable Integer bId) {
       Optional<Booking> booking = bookingService.getBooking(bId);

       UserDTO usersDTO=userClient.getUserById(booking.get().getuId());
       RoomDTO roomDTO=roomClient.getRoomById(booking.get().getrId());

       BookingDTO bookingDTO = new BookingDTO();
       bookingDTO.setbId(booking.get().getbId());
       bookingDTO.setUserDTO(usersDTO);
       bookingDTO.setRoomDto(roomDTO);

       return Optional.of(bookingDTO);

    }

    @DeleteMapping("/bookings/{bid}")
    public String deleteBooking(@PathVariable int bid)
    {
        return bookingService.deleteBooking(bid);
    }


}
