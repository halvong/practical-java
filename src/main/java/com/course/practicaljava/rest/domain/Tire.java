package com.course.practicaljava.rest.domain;

public class Tire {
    private String manufaturer;
    private int size;
    private int price;

    public Tire() {}

    public Tire(String manufaturer, int size, int price) {
        this.manufaturer = manufaturer;
        this.size = size;
        this.price = price;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufaturer = manufaturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "manufaturer='" + manufaturer + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}

