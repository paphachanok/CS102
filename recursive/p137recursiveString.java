package com.training.recursive;

import java.util.Scanner;

public class p137recursiveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numString(n));
    }

    public static String numString(int n) {
        if(n==0){
            return "";
        }
        if(n>0){
            return n+numString(n-1);
        }
        return n+"";
    }
}
