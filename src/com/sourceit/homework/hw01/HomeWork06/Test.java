package com.sourceit.homework.hw01.HomeWork06;

import com.sourceit.hometask.exceptions.CustomException;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Юля on 03.03.2015.
 */
public class Test {
    public static void main (String [] args) throws CustomException {

        StringUtilsImpl variable = new StringUtilsImpl();
        Scanner scr = new Scanner(System.in);
        System.out.println("Write down the first number: ");
        String var1 = scr.nextLine();
        System.out.println("Write down the second number: ");
        String var2 = scr.nextLine();
        System.out.println("Result of division: " + variable.div(var1, var2));


        String text = "We are beautiful";
        String word = "We";
        System.out.println(Arrays.toString(variable.findWord(text, word)));

        String text2 = "she is 22.5 years old";
        System.out.println(Arrays.toString(variable.findNumbers(text2)));

    }


}
