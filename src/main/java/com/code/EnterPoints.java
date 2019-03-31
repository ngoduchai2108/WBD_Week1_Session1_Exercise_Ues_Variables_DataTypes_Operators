package com.code;

import java.util.Scanner;

public class EnterPoints {
    static double total(double a, double b,double c){
        return a+b+c;
    }
    static double mediumScore(double a,double b,double c){
        return total(a,b,c)/3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Physical point: ");
        double pointPhysical = scanner.nextDouble();
        System.out.println("Enter Chemistry point: ");
        double pointChemistry = scanner.nextDouble();
        System.out.println("Enter Biology point: ");
        double pointBiology = scanner.nextDouble();
        System.out.println("Total of student is : "+ total(pointPhysical,pointChemistry,pointBiology));
        System.out.println("Medium Score of student is : "+mediumScore(pointBiology,pointChemistry,pointPhysical));
    }
}
