package com.company;
import java.util.Scanner;
/**
 * Created by skailigan on 3/28/17.
 */
public class SummTwoDigitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! Please enter Two-digit number:");
        String input = sc.nextLine();
        int twoDigitNumber = Integer.parseInt(input);
        if (twoDigitNumber<=99&&twoDigitNumber>=-99) {
            int firstNumber = (int) twoDigitNumber / 10;
            int lastNUmber = twoDigitNumber%10;
            System.out.println("The summ of numbers:"+(firstNumber+lastNUmber));
            System.out.println("You choose number:"+twoDigitNumber);
        }
        else {
            System.out.println("You chose Incorrect number");
        }

    }
}