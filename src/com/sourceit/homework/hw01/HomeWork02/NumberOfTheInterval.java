package com.sourceit.homework.hw01.HomeWork02;

/**
 * Created by Юля on 15.02.2015.
 */
import java.util.Random;
public class NumberOfTheInterval{

    public static void main (String [] args){


        Random r = new Random();
        for (int i = 5; i < 6 ; i++) {
            System.out.println(r.nextInt(155));
            int n = r.nextInt ();



            if ( n > 25 | n < 100 ){
                System.out.println ("The number is inside of the interval");
            }
            else {
                System.out.println ("The number is outside of the interval");
            }

        }

    }
}