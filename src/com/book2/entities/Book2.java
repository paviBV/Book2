package com.book2.entities;

public class Book2 {
    String bId;
    String bName;
    int bCost;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbCost() {
        return bCost;
    }

    public void setbCost(int bCost) {
        this.bCost = bCost;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "bId='" + bId + '\'' +
                ", bName='" + bName + '\'' +
                ", bCost=" + bCost +
                '}';
    }
}
