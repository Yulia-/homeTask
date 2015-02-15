package com.sourceit.homework.hw01.HomeWork03;

/**
 * Created by Юля on 15.02.2015.
 */

import java.util.*;
public class Tickets {

    public static void main (String [] args){
        int t1, t2, n=0;

        for (int n1=0; n1<10; n1++)
            for (int n2=0; n2<10; n2++)
                for (int n3=0; n3<10; n3++)
                    for(int n4=0; n4<10; n4++)
                        for (int n5=0; n5<10; n5++)
                            for (int n6=0; n6<10; n6++ ){
                                t1 = n1+n2+n3;
                                t2 = n4+n5+n6;
                                if (t1==t2) {
                                    n++;
                                }

                            }
        System.out.println (n);


    }
}
