package com.company;
import java.util.Scanner;

/**
 * Created by skailigan on 4/3/17.
 */
public class CoordinatesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hi! Please, enter the 'dimension' number");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        String coordinate = null;
        for (int j=1;j<=n;j++){
            for (int i=1;i<=n;i++){
                 coordinate = (j+"."+i+";");
                System.out.print(coordinate+" ");
            }
            System.out.println();
        }

    }
}
