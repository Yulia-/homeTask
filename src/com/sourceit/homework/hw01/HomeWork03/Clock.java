package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 15.02.2015.
 */
public class Clock {
    public static void main (String [] args){
        int n1, n2, k=0;
        for (n1=0; n1<24; n1++)
            for (n2=0; n2<60; n2++)
                if (n1/10 == n2%10 & n1%10 == n2/10)
                    k++;
        System.out.println (k);
                    }
    
}

