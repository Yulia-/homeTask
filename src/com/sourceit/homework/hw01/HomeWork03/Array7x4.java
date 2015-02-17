package com.sourceit.homework.hw01.HomeWork03;

import java.util.*;
public class Array7x4 {
    public static void main(String[] args) {

        int max = 1;
        int i = 7;
        int j = 4;
        int[][] arr = new int[i][j];

        Random r = new Random();

        for (i = 0; i < 7; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = (r.nextInt(11) - 5);

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] a = new int[7];
        for (int k = 0; k < 7; k++) {
            a[k] *= arr[i][j];
            for (k = 0; k < 7; k++) {
                if (Math.abs(a[k]) < max) {
                    max = Math.abs(a[k]);
                    k = i;
                }
                System.out.println(k);
            }
        }

    }
}
