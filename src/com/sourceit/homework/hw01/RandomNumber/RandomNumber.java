package com.sourceit.homework.hw01.RandomNumber;


/**
 * Created by Юля on 13.02.2015.
 */
import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 100; i < 101; i++) ;

        System.out.println(r.nextInt(999));

        int s = r.nextInt ();

        int a = s % 10;;
        int b = s / 100;
        int c = (s % 100) -a;

        if( a > b ) {
            if (a > c){
                System.out.println (a);
            } else {
                System.out.println (c);
            }
        } else {
            if (b > c){
                System.out.println (b);
            } else {
                System.out.println (c);
            }
        }




    }
}