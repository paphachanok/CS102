package com.training.OOP.FractionCal;

public class Fraction {
    private int numerator;
    private int donominator;

    public Fraction(int numerator, int donominator) {
        this.numerator = numerator;
        this.donominator = donominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDonominator() {
        return donominator;
    }

    public String toString(){
        if(donominator==1){
            return Integer.toString(numerator);
        }
        return numerator+"/"+donominator;
    }
    public void add(Fraction n){
        if(donominator!=n.getDonominator()){
            int temp = donominator;
            donominator*=n.getDonominator();
            numerator*=n.getDonominator();
            int ntemp = n.getNumerator()*temp;
            numerator+=ntemp;
        }else{
            numerator+= n.numerator;
        }
    }
    public void subtract(Fraction n){
        if(donominator!=n.getDonominator()){
            int temp = donominator;
            donominator*=n.getDonominator();
            numerator*=n.getDonominator();
            int ntemp = n.getNumerator()*temp;
            numerator-=ntemp;
        }else{
            numerator-= n.numerator;
        }
    }
    public void multiply(Fraction n){
        numerator*=n.getNumerator();
        donominator*=n.getDonominator();
    }
    public void divide(Fraction n){
        numerator*=n.getDonominator();
        donominator*=n.getNumerator();
        reduce();
    }

    public void reduce(){
        for(int i=numerator;i>=2;i--){
            while (numerator%i==0&&donominator%i==0){
                numerator/=i;
                donominator/=i;
            }
        }
    }
}
