package com.sourceit.homework.hw01.HomeWork03.Recursion;
import java.util.Scanner;
/**
 * Created by Юля on 18.02.2015.
 */
public class Sum {

    public static void main(String[] arg) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write down a number:");
        int n = scr.nextInt();
        System.out.println (sum (n));
    }

    static int sum (int n){

        if (n==0) return 0;
        else {
            return n + sum(n - 1);
        }
    }
}
