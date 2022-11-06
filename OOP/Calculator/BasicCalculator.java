package com.training.OOP.Calculator;

public class BasicCalculator implements Calculator {
    private double result;

    public BasicCalculator() {
        result=0;
    }

    public double getResult() {
        return result;
    }

    public void clear() {
        this.result = 0;
    }

    public void add(double input) {
        result += input;
    }

    public void subtract(double input) {
        result -= input;
    }

    public void divide(double input) {
        result /= input;
    }

    public void multiply(double input) {
        result *= input;
    }

}