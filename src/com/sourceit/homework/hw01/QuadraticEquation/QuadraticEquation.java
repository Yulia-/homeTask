package com.sourceit.homework.hw01.QuadraticEquation;

/**
 * Created by Юля on 13.02.2015.
 */
import java.util.Scanner;
public class QuadraticEquation {
    public static void main (String [] args){
        double x1, x2;

        Scanner in = new Scanner (System.in);
        System.out.println ("Write down the value of a:");
        double a = in.nextDouble();
        System.out.println("Write down the value of b:");
        double b = in.nextDouble();
        System.out.println ("Write down the value of c:");
        double c = in.nextDouble();

        double d =  Math.pow(b,2) - 4 * a * c;

        if ( d < 0){
            System.out.println ("No roots");
        }
        else {

            x1 = (( -b + Math.sqrt( d )) / 2 * a );

            System.out.println (x1);

            x2 = (( -b - Math.sqrt( d )) / 2 * a );

            System.out.println (x2);
        }



    }
}
