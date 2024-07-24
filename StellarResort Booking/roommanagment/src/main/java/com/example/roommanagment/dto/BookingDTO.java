package com.example.roommanagment.dto;


import java.util.List;


public class BookingDTO {

    public Integer bId;
//    public Integer uId;
//    List<Integer> rId;
    UserDTO userDTO;
    RoomDTO roomDto;

//    public List<Integer> getrId() {
//        return rId;
//    }
//
//    public void setrId(List<Integer> rId) {
//        this.rId = rId;
//    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bId=" + bId +
               // ", uId=" + uId +
//                ", rId=" + rId +
                ", userDTO=" + userDTO +
                ", roomDto=" + roomDto +
                '}';
    }

    public BookingDTO(Integer userId, UserDTO userDTO, RoomDTO roomDTOList) {
      //  this.uId = userId;
        this.roomDto = roomDTOList;
        this.userDTO = userDTO;
    }


    public RoomDTO getRoomDto() {
        return roomDto;
    }

    public void setRoomDto(RoomDTO roomDto) {
        this.roomDto = roomDto;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public BookingDTO(Integer userId, List<Integer> roomDTOList) {
        //this.uId = userId;
        //this.rId = roomDTOList;
    }

    public BookingDTO() {

    }


    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

//    public Integer getuId() {
//        return uId;
//    }
//
//    public void setuId(Integer uId) {
//        this.uId = uId;
//    }


}
