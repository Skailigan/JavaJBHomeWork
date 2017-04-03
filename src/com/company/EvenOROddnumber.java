package com.company;
import java.util.Scanner;

/**
 * Created by skailigan on 3/28/17.
 */
public class EvenOROddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter please a number:");
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
        if(number%2==0){
            System.out.println(number+" "+"is Even number");
        }
        else {
            System.out.println(number+" "+"is Odd number");
        }
    }
}
