package com.training.OOP.p66CarStock;

public class Car {
    private String name;
    private String brand;
    private int price;

    public Car(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.price = 1000000;
    }

    public Car(String name) {
        this.name = name;
        this.brand = "BMW";
        this.price = 1000000;
    }

    public Car() {
        this.name = "Car1";
        this.brand = "BMW";
        this.price = 1000000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
