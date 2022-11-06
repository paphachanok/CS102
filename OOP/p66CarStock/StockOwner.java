package com.training.OOP.p66CarStock;

public class StockOwner extends Stock {
    private String name;
    private int money;
    private int asset;

    public StockOwner(String name,int money){
        this.name= name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void buyCar(Stock stock,Car car){
        stock.buy(car);
        money-=car.getPrice();
        asset+=car.getPrice();
    }
    public int calculateAllAsset(){
        return asset;
    }
    public int getAmountofCar(){
        int cnt=0;
        for(Stock a:this.stocks){
                cnt+=a.cars.size();
        }
        return cnt;
    }
    public void buyAllCar(Stock stk1,Stock stk2){
        for(int i=0;i<stk2.cars.size();i++){
            stk1.buy(stk2.cars.get(i));
            money-=stk2.cars.get(i).getPrice();
            asset+=stk2.cars.get(i).getPrice();
        }
        stk2.cars.removeAll(stk1.cars);
    }
}
