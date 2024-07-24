package com.example.roommanagment.dto;

public class RoomDTO {

   public Integer rId;
    public String roomType;
    public Integer price;

//    public Integer bId;

//    public Integer getbId() {
//        return bId;
//    }
//
//    public void setbId(Integer bId) {
//        this.bId = bId;
//    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomDTO{" +
                "rId=" + rId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
