package com.training.OOP.Student;

public class Student {
    private int id;
    private String name;
    private char gender;
    private int score;

    public Student(int id, String name, char gender, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public char calGPA(){
        return score>=80?'A':score>=70?'B':score>=60?'C':score>=50?'D':'F';
    }
}


