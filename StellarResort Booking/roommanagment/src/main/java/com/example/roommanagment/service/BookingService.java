package com.example.roommanagment.service;



import com.example.roommanagment.dto.BookingDTO;
import com.example.roommanagment.dto.VootingDTO;
import com.example.roommanagment.entity.Booking;
import com.example.roommanagment.feignService.RoomAppService;
import com.example.roommanagment.feignService.UserAppService;
import com.example.roommanagment.repository.BookingRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    RoomAppService roomClient;
    @Autowired
    UserAppService userClient;


    //@Autowired
    VootingDTO vootingDTO = new VootingDTO();

    public String createBooking(BookingDTO bookingdto) {
        for (int roomId :vootingDTO.getRids() ) {
            Booking book = new Booking();
            book.setuId(vootingDTO.getUid());
            book.setrId(roomId);
            bookingRepository.save(book);
        }
        return "Booking Successful";
    }

    public Optional<Booking> getBooking(int bid) {
        return bookingRepository.findById(bid);
    }
    public String deleteBooking(int bid) {
        bookingRepository.deleteById(bid);
        return "booking deleted";
    }







    /// BYY THE HELP OF USER ID WE WILL GET THE ALL ROOM WHICH IS REGISTERED BYY USER

//        List<Booking> bookings = bookingRepository.findByuId(userId);
//        List<RoomDTO> roomDTOList = new ArrayList<>();
//
//        for (Booking booking : bookings) {
//            RoomDTO roomDTO = roomClient.getRoomById(booking.getrId());
//            roomDTOList.add(roomDTO);
//        }
//
//        UserDTO userDTO = userClient.getUserById(userId);
//
//        return new BookingDTO(userId,userDTO,roomDTOList);




}
