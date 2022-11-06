package com.training.OOP.Factory;

public class FactoryTester {
        public static void main(String[] args) {
            Factory fac1 = new Factory(67,9,10,1);
            System.out.println(fac1.getIron());
            System.out.println(fac1.getCopper());
            System.out.println(fac1.getSilver());

            System.out.println(fac1.getGold());
            System.out.println(fac1.getCircuitBoard());
            fac1.buildCircuitBoard(500000);
            fac1.buildCircuitBoard(850000);
            System.out.println(fac1.getIron());
            System.out.println(fac1.getCopper());
            System.out.println(fac1.getSilver());
            System.out.println(fac1.getGold());
            System.out.println(fac1.getCircuitBoard());
        }
}
