package com.company;

import java.util.Scanner;

/**
 * Created by skailigan on 3/28/17.
 */
public class ShortSorting3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        String sFirstNumber = sc.nextLine();
        int firstNumber = Integer.parseInt(sFirstNumber);
        System.out.println("Please enter second number:");
        String sSecondNumber = sc.nextLine();
        int secondNumber = Integer.parseInt(sSecondNumber);
        System.out.println("Please enter third number:");
        String sThirdNumber = sc.nextLine();
        int thirdNumber = Integer.parseInt(sThirdNumber);
        System.out.println("You enter numbers:"+" "+firstNumber+";"+secondNumber+";"+thirdNumber+";");
        System.out.println("Below is the sorting of numbers in descending order:");
        int max,min = 0;

        if (firstNumber>secondNumber){
            max = firstNumber;
            min = secondNumber;
        }
        else {
            max = secondNumber;
            min = firstNumber;
        }
        if (max<thirdNumber){
            max = thirdNumber;
        }
        else {
            if(min>thirdNumber){
                min = thirdNumber;
            }
        }
        System.out.println("1: "+max);
        System.out.println("2: "+((firstNumber+secondNumber+thirdNumber)-(max+min)));
        System.out.println("3: "+min);
    }


}
