package com.sourceit.homework.hw01.HomeWork03;

import java.util.*;
public class Array7x4 {
    public static void main (String [] args) {


        int max = 0;
        int 1 = 0;

        int[][] arr = new int[7][4];
        Random r = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (r.nextInt(11)-5);
                System.out.println(arr[7][4]);
                System.out.println( );

                int [] a = new int [7];
                for (int k=0; k<7; k++)
                    a[k]*=arr [i][j];
                for (int k=0;k<7; k++ ) {
                    max = Math.abs(a[k]);
                    if (Math.abs(a[k]) < max)
                        max = Math.abs(a[k]);
                    i = k;
                    System.out.println (k);
                }

            }
        }


    }
}
