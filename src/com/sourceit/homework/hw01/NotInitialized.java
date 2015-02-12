package com.sourceit.homework.hw01;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Юля on 12.02.2015.
 */
public class NotInitialized {
    public static void main (String[] args){
        int x = 7; // It isn't possible to print uninitialized variables. Program shows mistake:
        //Error:(11, 29) java: variable x might not have been initialized
        char t = 'T'; // It is the same for variable type char.

        System.out.println (x);
        System.out.println (t);
    }



}
