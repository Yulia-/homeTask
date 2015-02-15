package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 15.02.2015.
 */
public class Fibonacci11numbers {
    public static void main (String [] args){

        int x = 1, y = 1, f;

        System.out.print(x + " " + y + " ");

        while (y < 89) {

            f = x + y;

            x = y;
            y = f;


            System.out.print ( f + " " );
        }
    }
}
