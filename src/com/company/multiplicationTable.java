package com.company;
import java.util.Scanner;

/**
 * Created by skailigan on 4/3/17.
 */
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hi! Please, enter the number");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        for (int j=1;j<=n;j++){
            for (int i=1;i<=n;i++){
                System.out.printf("%5d ",j*i
                );
            }
            System.out.println();
        }

    }
}
