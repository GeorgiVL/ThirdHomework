package com.company.ThirdHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        int numberDay = scanner.nextInt();

        switch(numberDay) {
            case 1:
                System.out.println("You entered: " + numberDay + ". So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered: " + numberDay + ". So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered: " + numberDay + ". So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered: " + numberDay + ". So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered: " + numberDay + ". So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered: " + numberDay + ". So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered: " + numberDay + ". So week day is Sunday.");
                break;
            default:
                System.out.println("This is not a day of the week!");
                break;

        }
    }
}
