package com.training.recursive;

import java.util.Scanner;

public class recursion2 {

    public static String binary(int a) {
        if (a == 0) {
            return "";
        }
        return binary(a / 2) + "" + a % 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = binary(a);
        System.out.println(ans);
    }
}
