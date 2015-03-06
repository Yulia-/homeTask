package com.sourceit.homework.hw01.HomeWork06;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Юля on 03.03.2015.
 */
public class StringUtilsImpl implements StringUtils {



    @Override
    public double div(String var1, String var2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (var1 == null){
            throw new NullPointerException("Value of the first number is null");
        }
        if (var2 == null){
            throw new NullPointerException("Value of the second number is null");
        }
        double number1 = Double.parseDouble(var1);
        try {
            number1 = Double.parseDouble(var1);
        } catch (NumberFormatException e){
            System.out.println("Written first variable is not a number");
        }

        double number2 = Double.parseDouble(var2);
        try {
            number2 = Double.parseDouble(var2);
        } catch (NumberFormatException e){
            System.out.println("Written second variable is not a number");
        }

        if (number2==0){
            throw new ArithmeticException("Divisor can't be 0");
        }
        return number1/number2;
    }

    @Override
    public int[] findWord(String s, String s1) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        return new double[0];
    }
}
