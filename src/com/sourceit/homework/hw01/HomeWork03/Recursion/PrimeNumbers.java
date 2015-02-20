package com.sourceit.homework.hw01.HomeWork03.Recursion;

import java.util.Scanner;

/**
 * Created by Юля on 20.02.2015.
 */
// something doesn't work here
public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write down a number:");
        int n = scr.nextInt();
        System.out.println(prime(n));

    }
    static int prime( int n){
        for (int i = 2; i < n; i++) {

            if (n == 2)
                return 2;
            else if ((i%prime(n-1))!=0)
                return i;
            else continue;
        }
    }


}

