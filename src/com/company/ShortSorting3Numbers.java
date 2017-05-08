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
        int x = Integer.parseInt(sFirstNumber);
        System.out.println("Please enter second number:");
        String sSecondNumber = sc.nextLine();
        int y = Integer.parseInt(sSecondNumber);
        System.out.println("Please enter third number:");
        String sThirdNumber = sc.nextLine();
        int z    = Integer.parseInt(sThirdNumber);
        System.out.println("You enter numbers:"+" "+x+";"+y+";"+z+";");
        System.out.println("Below is the sorting of numbers in descending order:");
        int temp = 0;

        if (z >= y){
            temp = z;
            z = y;
            y = temp;
        }

        if (x >= y){
        }
        else {
            temp = x;
            x = y;
            y = temp;
            }

        System.out.println("1: "+ x);
        System.out.println("2: "+ y);
        System.out.println("3: "+ z);
    }


}
