package com.sourceit.homework.hw01.HomeWork03.Recursion;

import java.util.Scanner;

/**
 * Created by Юля on 19.02.2015.
 */
public class TheTowerOfHanoi {
    public static void main (String [] arg) {
        int k = 2;
        Scanner scr = new Scanner(System.in);
        System.out.println("Write down the number of disks:");
        int n = scr.nextInt();
        System.out.println (pow( k, n) - 1 );
    }
    static int pow(int k,int n) {

        if (n == 0) return 1;
        else
            return k * pow(k, n - 1);
    }
}
