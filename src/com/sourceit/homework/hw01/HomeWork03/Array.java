package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 16.02.2015.
 */

import java.util.*;
public class Array {
    public static void main (String [] args) {

        int i1 = 8;
        int j1 = 5;
        int[][] arr = new int[i1][j1];

        Random r = new Random();

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                arr[i][j] = (r.nextInt(90)+10);
                System.out.println(arr[i1][j1]);
            }
        }
    }

}
