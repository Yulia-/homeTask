package com.sourceit.homework.hw01.HomeWork05;

/**
 * Created by Юля on 27.02.2015.
 */
public class Test {
    public static void main (String [] args){

        FractionNumber var1 = new FractionNumber();

        var1.setDividend(2);
        var1.setDivisor(5);
        System.out.println(var1);

        FractionNumber var2 = new FractionNumber();
        var2.setDividend(1);
        var2.setDivisor(3);

        System.out.println(var2);

    }
}
