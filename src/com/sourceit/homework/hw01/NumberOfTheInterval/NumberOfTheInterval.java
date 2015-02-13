package com.sourceit.homework.hw01.NumberOfTheInterval;

/**
 * Created by Юля on 13.02.2015.
 */
import java.util.*;
public class NumberOfTheInterval{

    public static void main (String [] args){


        Random r = new Random();
        for (int i = 5; i<10; i++) {
            System.out.println(r.nextInt(155));
        }
        
            if ( r > 26 & r < 99 ){
                System.out.println ("The number is in the interval");
            }
            else {
                System.out.println ("The number is outside of the interval");
            }



    }
}