package com.sourceit.homework.hw01.HomeWork03.Recursion;

/**
 * Created by Юля on 20.02.2015.
 */
// something doesn't work here
import java.util.Scanner;
public class NaturalNumbersLine {


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write down a number:");
        int n = scr.nextInt();
        System.out.println(nat(n));

    }
    static int nat( int n){
        for (int i = 2; i < n; i++) {

            if (n == 2)
                return 2;
            else if ((i%nat(n-1))!=0)
                return i;
            else break;
        }
    }


}