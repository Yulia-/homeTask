package com.sourceit.homework.hw01.Triangle;

/**
 * Created by Юля on 13.02.2015.
 */
import java.util.*;
public class Triangle {
    public static void main (String [] args){
        double c, S, P;

        Scanner in = new Scanner(System.in);

        System.out.print ("Write down the length of cathetus a:");
        int a = in.nextInt();
        System.out.print ("Write down the length of cathetus b:");
        int b = in.nextInt();

        S = ( a + b ) / 2;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        P = a + b + c;

        System.out.print("S = ");
        System.out.println(S);
        System.out.print ("P = ");
        System.out.print(P);
    }


}
