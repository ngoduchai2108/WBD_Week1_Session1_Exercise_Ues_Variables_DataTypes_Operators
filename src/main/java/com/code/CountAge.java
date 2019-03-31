package com.code;

import java.util.Scanner;

public class CountAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter Year of Birth:");
            year = scanner.nextInt();
            if (year >= 2019){
                System.out.println("Year of Birth should NOT exceed 2019!!!");
            }
        }while (year >=2019);
        int age = 2019 - year;
        System.out.println("Age of that is = "+ age);


    }
}
