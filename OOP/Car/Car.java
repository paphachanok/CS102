package com.training.OOP.Car;

public class Car {
    private String id;
    private String name;
    private String color;
    private int velocity;
    private int distance;
    public static int accumulate_distance;
    public Car(String id, String name, String color, int velocity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.velocity = velocity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void drive(int sec){
        distance = sec*velocity;
        accumulate_distance += distance;
    }

}
