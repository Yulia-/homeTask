package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 15.02.2015.
 */

import java.util.*;
public class SumNumerals {
    public static void main (String [] args) {

        int sum = 0;


        System.out.println("Write down a number:");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while ( n != 0  ) {
            sum = sum + (n % 10);
            n = n/10;

        }
        System.out.println ( sum );

    }
}