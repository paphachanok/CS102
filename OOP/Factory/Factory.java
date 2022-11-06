package com.training.OOP.Factory;

public class Factory {
    private double iron, copper, silver,gold;
    private int ccb;

    public Factory (double iron,double copper,double silver,double gold){
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getCopper() {
        return copper;
    }

    public void setCopper(double copper) {
        this.copper = copper;
    }

    public double getSilver() {
        return silver;
    }

    public void setSilver(double silver) {
        this.silver = silver;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }
    public int getCircuitBoard(){
     return ccb;
    }
    public void buildCircuitBoard(int n){
        copper-=0.000005*n;
        silver-=0.000002*n;
        gold-=0.00000001*n;
        ccb+=n;
    }
}
