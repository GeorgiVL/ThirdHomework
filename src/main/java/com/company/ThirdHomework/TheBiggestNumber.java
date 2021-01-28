package com.company.ThirdHomework;

import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        int numA = scanner.nextInt();

        System.out.println("Enter B: ");
        int numB = scanner.nextInt();

        System.out.println("Enter C: ");
        int numC = scanner.nextInt();

        if(numA >= numB && numA >= numC) {
            System.out.println(numA);
        } else if(numB >= numA && numB >= numC) {
            System.out.println(numB);
        } else {
            System.out.println(numC);
        }
    }
}
