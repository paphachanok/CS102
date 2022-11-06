package com.training.OOP.FractionCal;

public class Tester {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5,6);
        Fraction f2 = new Fraction(3,8);
        Fraction f3 = new Fraction(12,18);
        f2.add(f1);
        f2.reduce();
        System.out.println(f2);
        f1.multiply(f2);
        System.out.println(f1);

        f3.reduce();
        System.out.println(f3);

    }
}
