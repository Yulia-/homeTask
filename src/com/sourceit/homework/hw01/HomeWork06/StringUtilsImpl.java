package com.sourceit.homework.hw01.HomeWork06;
import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Юля on 03.03.2015.
 */
public class StringUtilsImpl implements StringUtils {


    @Override
    public double div(String var1, String var2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (var1 == null) {
            throw new NullPointerException("Value of the first number is null");
        }
        if (var2 == null) {
            throw new NullPointerException("Value of the second number is null");
        }
        double number1 = Double.parseDouble(var1);
        try {
            number1 = Double.parseDouble(var1);
        } catch (NumberFormatException e) {
            System.out.println("Written first variable is not a number");
        }

        double number2 = Double.parseDouble(var2);
        try {
            number2 = Double.parseDouble(var2);
        } catch (NumberFormatException e) {
            System.out.println("Written second variable is not a number");
        }

        if (number2 == 0) {
            throw new ArithmeticException("Divisor can't be 0");
        }
        return number1 / number2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        int k = 0;
        int[] mass2 = new int[k];
        if (text == null) {
            throw new NullPointerException("Text is null");
        }
        if (word == null) {
            throw new NullPointerException("Word is null");
        }
        String [] mass = text.split(" ");

        for (int i = 0; i < mass.length; i++) {
            if (mass[i].equals(word)) {
                for (k = 0; k < mass.length; k++) {
                    mass2[k] = i;
                }
            }
        } return mass2;
    }

    @Override
    public double[] findNumbers(String text2) throws CustomException {
        double number;
        String [] massForDouble = text2.split(" ");
        int k = 0;
        double [] massDouble = new double [k];

        for (int i=0; i<massForDouble.length; i++) {
            number = Double.parseDouble(massForDouble[i]);
            for (k=0; k<massForDouble.length; k++ )
                massDouble[k] = number;
        }
        if (massDouble[k] == 0){
            throw new CustomException("No double value was found in the text");
        }

        return  massDouble;


    }
}