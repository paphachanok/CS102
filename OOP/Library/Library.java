package com.training.OOP.Library;

import java.util.ArrayList;

import java.util.Comparator;

public class Library {
    private String name;
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee p){
        employees.add(p);
    }
    public boolean removeEmployee(int n){
        for(Employee employee: employees){
            if(employee.getEmployeeId()==n){
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }
    public int getNumberOfEmployees(){
        return employees.size();
    }
    public double getTotalSalary(){
        double salary=0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }
    public void addBook(Book book){
        books.add(book);
        books.sort(bookID);

    }
    public static Comparator<Book> bookID= (o1, o2) -> {
        int bookno1 = o1.getId();
        int bookno2 = o2.getId();
        return bookno1-bookno2;
    };
    public void printInfoOfAllBooks(){
        for (Book book : this.books) {
            System.out.println("(id: " + book.getId() + ", name : " + book.getName() + ")");
        }
    }
    public int searchBookByName(String name){
        int cnt = 0;
        for(Book book : books){
            if(book.getName().equals(name)){
                cnt++;
            }
        }
        return cnt;
    }
    public int searchBookById(int id){
        for(Book book : books){
            if(book.getId()==id){
                return books.indexOf(book);
            }
        }
        return -1;
    }
    public Book borrowBook(int id){
        for(Book book:books){
            if(book.getId()==id){
                books.remove(book);
                return book;
            }
        }
        return null;
    }
    public void returnBook(Book book){
        books.add(book);
        books.sort(bookID);
    }
    public int getAmountOfBooks(){
        return books.size();
    }
}
