package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 16.02.2015.
 */


public class Array8x5 {
    public static void main(String[] args) {

        int i, j;

        int[][] a = new int[8][5];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                int r = (10 + (int) (Math.random() * ((99 - 10) + 1)));
                a[i][j] = r;
                System.out.print(a[i][j] +" ");
            }
            System.out.print(" ");
        }

    }
}










