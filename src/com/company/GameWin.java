package com.company;

import java.util.Scanner;

/**
 * Created by skailigan on 4/3/17.
 */
public class GameWin {
    public static void main(String[] args) {
        int secretNumber = (int) (1 + Math.random() * 10);
        int attempts = 3;
        int guessingNumber = Integer.MAX_VALUE;
        System.out.println("Hi! I've chosen a number from 1 to 10 for you! You have " + attempts + " attempts");
        do {
            System.out.println("You have " + attempts + " attempts.");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            guessingNumber = Integer.parseInt(input);
            attempts--;
            if (guessingNumber == secretNumber) {
                System.out.print("Congratulation! You WIN");
            } else {
                System.out.println("Wrong!");
            }
            if (attempts == 1) {
                if (secretNumber % 2 == 0) {
                    System.out.println("HINT: The number is even");
                } else {
                    System.out.println("Hint: The number is odd");
                }
            }
        }
        while (attempts > 0 && guessingNumber != secretNumber);
        if (attempts == 0 && guessingNumber != secretNumber) {
            System.out.println("You Lose! The number was " + secretNumber);
        }


    }
}

