package com.code;

import java.util.Scanner;

public class CelsiusConvertFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number Celsius:");
        double celsius = scanner.nextDouble();
        System.out.println(celsius+" C = "+((9*celsius/5)+32 )+ " F.");
    }
}
