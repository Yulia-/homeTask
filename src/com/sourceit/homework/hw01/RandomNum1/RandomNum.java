package com.sourceit.homework.hw01.RandomNum1;

/**
 * Created by Юля on 13.02.2015.
 */

import java.util.*;
public class RandomNum {
    public static void main(String[] args) {

        System.out.println ("Write down a number:");
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();

        Random r = new Random();
        for(int i = -a; i<-9999; i++); {
            System.out.println( r.nextInt(a) );
        }




    }


}
