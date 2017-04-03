package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by skailigan on 3/28/17.
 */
public class idMaxNumbers {
    public static void main(String[] args) {
        int counter =1;
        int id=0;
        int number = 0;
        int max = number;
            while (counter<=100){
                ++counter;
                number=(int)(1+Math.random()*99999999);

            if(max<number){
                max=number;
                id=counter;

            }

        }
            System.out.println("The highest number is "+max+" and his id is "+id);
    }
}
