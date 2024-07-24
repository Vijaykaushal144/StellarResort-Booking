package com.example.roommanagment.dto;

import java.util.List;

public class VootingDTO {
    private Integer uid;
    private List<Integer> rids;

    public VootingDTO(Integer uid, List<Integer> rids) {
        this.uid = uid;
        this.rids = rids;
    }
    public VootingDTO() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<Integer> getRids() {
        return rids;
    }

    public void setRids(List<Integer> rids) {
        this.rids = rids;
    }

    @Override
    public String toString() {
        return "newBookingDTO{" +
                "uid=" + uid +
                ", rids=" + rids +
                '}';
    }
}
