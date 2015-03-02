package com.sourceit.homework.hw01.HomeWork05;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Юля on 27.02.2015.
 */
public class Test {
    public static void main (String [] args){

        FractionNumberImpl var1 = new FractionNumberImpl();

        var1.setDividend(1);
        var1.setDivisor(2);
        System.out.println(var1);

        FractionNumberImpl var2 = new FractionNumberImpl();
        var2.setDividend(1);
        var2.setDivisor(4);
        System.out.println(var2);




        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        System.out.println("Addition:" + operation.add(var1, var2));
        System.out.println("Subtraction:" + operation.sub(var1, var2));
        System.out.println("Multiplication:" + operation.mul(var1, var2));
        System.out.println("Division:" + operation.div(var1, var2));
        System.out.println(operation.parseFractionNumber(String var1);


        Random r = new Random();
        FractionNumberImpl [] arr = new FractionNumberImpl [10];
        for (int i = 0; i<arr.length; i++){
            FractionNumberImpl element = new FractionNumberImpl();
            element.setDividend( r.nextInt(10)+1);
            element.setDivisor(r.nextInt(10)+1);
            arr [i] = element;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++)
            System.out.print (arr[i]+" ");

    }

}
