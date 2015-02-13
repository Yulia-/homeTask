package com.sourceit.homework.hw01.Parity;

/**
 * Created by Юля on 13.02.2015.
 */
import java.util.*;
public class Parity {
    public static void main(String[] args) {
        int i;

        System.out.println("Введите целое число: ");

        Scanner scn= new Scanner(System.in);
        i= scn.nextInt();
        if( i % 2 == 0) {
            System.out.println("число четное");
        }
        else{
            System.out.println("число нечетное");
        }
    }
}
