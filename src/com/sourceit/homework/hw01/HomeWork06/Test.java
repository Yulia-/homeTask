package com.sourceit.homework.hw01.HomeWork06;

import java.util.Scanner;

/**
 * Created by Юля on 03.03.2015.
 */
public class Test {
    public static void main (String [] args){

        StringUtilsImpl variable = new StringUtilsImpl();
        Scanner scr = new Scanner(System.in);
        System.out.println("Write down the first number: ");
        String var1 = scr.nextLine();
        System.out.println("Write down the second number: ");
        String var2 = scr.nextLine();
        System.out.println("Result of division: " + variable.div(var1, var2));

    }


}
