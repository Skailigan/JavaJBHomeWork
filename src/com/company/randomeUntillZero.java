package com.company;

/**
 * Created by skailigan on 4/3/17.
 */
public class randomeUntillZero {
    public static void main(String[] args) {
        int rndNumber=Integer.MAX_VALUE;
        int tempNumber;
        int digitNumber=0;
        while (rndNumber!=0){
            rndNumber=(int)(Math.random()*1000);
            tempNumber=rndNumber;
            while (tempNumber>0){
                tempNumber =  (tempNumber / 10);
                digitNumber++;
            }
            System.out.println("The randome Number is: "+rndNumber);
            System.out.println("The digits of Number is: "+digitNumber);
            digitNumber=0;

        }
    }
}
