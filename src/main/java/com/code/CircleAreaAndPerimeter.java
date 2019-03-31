package com.code;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius od Circle:");
        double radius = scanner.nextDouble();
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Circle with radius is "+ radius+", has Perimeter = "+perimeter+", Area = "+area);
    }
}
