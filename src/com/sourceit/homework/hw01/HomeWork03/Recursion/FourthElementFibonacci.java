package com.sourceit.homework.hw01.HomeWork03.Recursion;

/**
 * Created by Юля on 20.02.2015.
 */
public class FourthElementFibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(15));
        System.out.println("Number of counting 4th element " +n);

    }
    static int n = 0;
    static int fibonacci(int i) {

        if (i==4) {
            n++;
        }

        if (i <= 2)
            return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}