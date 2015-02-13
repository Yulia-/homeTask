package com.sourceit.homework.hw01.TheClosestNumber;

/**
 * Created by Юля on 13.02.2015.
 */
//   This program works only with integer numbers. I wrote "double n = in.nextDouble(); " but it didn't help.
import java.util.*;
public class TheClosestNumber {
    public static void main (String [] args){


        Scanner in = new Scanner(System.in);
        System.out.println ("Write down the first number:");
        double n = in.nextDouble();
        System.out.println ("Write down the second number:");
        double m = in.nextDouble();

        double k = n - 10;
        double p = m -10;
        double s = Math.abs(k);
        double t = Math.abs(p);

        if (s > t) {
            System.out.println("The closest number to 10 is:");
            System.out.println (m);
        }
        else {
            System.out.println ("The closest number to 10 is:");
            System.out.println (n);
        }


    }

}