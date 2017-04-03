package com.company;

import java.util.Scanner;

/**
 * Created by skailigan on 4/2/17.
 */
public class summDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number from 0 to 2147483647");
        String inputnumber = sc.nextLine();
        int number = Integer.parseInt(inputnumber);
        int summ = 0;

        System.out.println(number);

        while (number > 0) {
            summ += number % 10;
            number =  (number / 10);
        }

        System.out.println(summ);


    }
}
