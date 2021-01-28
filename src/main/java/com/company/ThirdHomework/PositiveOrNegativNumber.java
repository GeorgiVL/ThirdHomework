package com.company.ThirdHomework;

import com.sun.security.jgss.GSSUtil;

public class PositiveOrNegativNumber {
    public static void main(String[] args) {
        Number(5);
        Number(-5);
        Number(0);
    }
    public static void Number(int number) {
        if(number > 0) {
            System.out.println("The number is positive!");
        } else if (number < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is exactly " + number);
        }
    }
}
