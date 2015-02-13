package com.sourceit.homework.hw01.RandomNumber;


/**
 * Created by Юля on 13.02.2015.
 */

//Something doesn't work in this program

import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 0; i < 5; i++) ;

        System.out.println(r.nextInt(999));



        int a = r.nextInt / 100;
        int b = r.nextInt % 100 / 10;
        int c = r.nextInt % 100 - b;

        if( a > b ) {
            if (a > c){
                System.out.println (a);
            }
            else {
                System.out.println (c);
            }

        }
        else {
            if (b > c){
                System.out.println (b);
            }
            else {
                System.out.println (c);
            }
        }




    }
}
