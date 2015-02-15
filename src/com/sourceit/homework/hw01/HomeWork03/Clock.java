package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 15.02.2015.
 */
public class Clock {
    public static void main (String [] args){
        int n1, n2, n3, n4, k=0;
        for (n1=0; n1<3; n1++)
            for (n2=0; n2<10; n2++)
                for (n3=0; n3<6; n3++)
                    for (n4=0; n4<10; n4++){
                        if (n1==n4)
                            if(n2==n3)
                                k++;
                    }
        System.out.println (k);
    }
}
