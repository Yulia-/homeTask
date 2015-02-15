package com.sourceit.homework.hw01.HomeWork02;

/**
 * Created by Юля on 15.02.2015.
 */
import java.util.*;
public class SumNumbers {
    public static void main (String [] args){

        int a, b, c;

        System.out.println ("Write down two-digit number:");
        Scanner scn = new Scanner (System.in);
        a = scn.nextInt();


        b = a / 10;
        c = a % 10;
        int sum = b + c;
        System.out.print("Sum of the numbers = " );
        System.out.print ( sum );

    }

}
