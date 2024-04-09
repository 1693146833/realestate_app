package com.example.realestate.Domain;

import java.io.Serializable;

public class ItemsDmain implements Serializable {
    private  String title;
    private  String description;
    private  String address;
    private int price;
    private int bed;
    private int bath;
    private String pic;
    private boolean wifi;
    public ItemsDmain(String title, String description, String address, int price, int bed, int bath, String pic, boolean wifi) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.price = price;
        this.bed = bed;
        this.bath = bath;
        this.pic = pic;
        this.wifi = wifi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}

