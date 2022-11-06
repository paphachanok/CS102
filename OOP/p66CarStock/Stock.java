package com.training.OOP.p66CarStock;

import java.util.ArrayList;

public class Stock {
    ArrayList<Stock> stocks = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    public void AddStock(Stock stock){
        stocks.add(stock);
    }
    public void buy(Car car){
        cars.add(car);
    }
    public void printAllCar(){
        for(Car car:this.cars){
            System.out.println("Car Name : "+car.getName()+"\nCar Brand : "+car.getBrand()+"\nCar Price : "+car.getPrice());
        }
    }


}
