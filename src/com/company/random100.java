package com.company;

/**
 * Created by skailigan on 4/2/17.
 */
public class random100 {
    public static void main(String[] args) {
        int randomNumber;
        int counter = 1;
        int summTwoDigit = 0;
        int idMin = 0;
        int min = Integer.MAX_VALUE;
        while (counter <= 100) {
            randomNumber = (int) (1 + Math.random() * 99);// random number from 1 to 100
            System.out.println("ID: "+counter + "\t Value: " + randomNumber);

            if (randomNumber <= min) {
                min = randomNumber;
                idMin = counter;
            }

            if (randomNumber % 2 == 0) {
                summTwoDigit += randomNumber;
            }
            counter++;

        }
        System.out.println("The minimum number is: " + min + ";");
        System.out.println("The ID of minimum number is: " + idMin + ";");

        System.out.println("The Summ of two-digit numbers are: " + summTwoDigit + ";");
    }
}

