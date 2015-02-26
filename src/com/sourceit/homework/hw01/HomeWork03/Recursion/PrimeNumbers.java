package com.sourceit.homework.hw01.HomeWork03.Recursion;

import java.util.Scanner;

/**
 * Created by Юля on 20.02.2015.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Write down a number:");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        PrimeNumbers prime = new PrimeNumbers();
        prime.checkNumber(n);

    }


    void checkNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i, i - 1))
                System.out.print(i + "   ");
        }
    }

    boolean isPrime(int p, int k) {
        if (k == 1) {
            return true;
        }
        if (p % k != 0) {
            return isPrime(p, k - 1);
        }
        return false;

    }
}