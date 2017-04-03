package com.company;

import java.util.Scanner;

/**
 * Created by skailigan on 3/28/17.
 */
public class positiveMaxStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive number.:");
        System.out.println("Remmember, -1 will stoped cycle and show you max number.");
        String sNumber = sc.nextLine();
        int number = Integer.parseInt(sNumber);
        int max = number;

        while (number != -1) {
            System.out.println("Enter next positive number or -1 for exit");
            sNumber = sc.nextLine();
            number = Integer.parseInt(sNumber);
            if (max < number) {
                max = number;
            }
        }

        System.out.println("The max number you choose: " + max);
    }
}





