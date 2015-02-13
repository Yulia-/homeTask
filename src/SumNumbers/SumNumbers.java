package SumNumbers;

/**
 * Created by Юля on 13.02.2015.
 */
import java.util.*;
public class SumNumbers {
    public static void main (String [] args){

        int a, b, c;

        System.out.println ("Введите двузначное число:");
        Scanner scn = new Scanner (System.in);
        a = scn.nextInt();


        b = a / 10;
        c = a % 10;
        int sum = b + c;
        System.out.print("сумма цифр числа = " );
        System.out.print ( sum );

    }


}
