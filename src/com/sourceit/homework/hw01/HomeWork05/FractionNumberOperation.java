package com.sourceit.homework.hw01.HomeWork05;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Юля on 27.02.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {
    FractionNumber add(FractionNumber var1, FractionNumber var2) {
        int dividend = var1.getDivisor() * var2.getDividend() + var2.getDivisor() * var1.getDividend();
        int divisor = var1.getDivisor() * var2.getDivisor();
        return new FractionNumber(dividend, divisor);
    }



    FractionNumber sub(FractionNumber var1, FractionNumber var2){
        int dividend = var2.getDivisor() * var1.getDividend() - var1.getDivisor() * var2.getDividend();
        int divisor = var1.getDivisor() * var2.getDivisor();
        return new FractionNumber (dividend, divisor);
    }

    FractionNumber mul(FractionNumber var1, FractionNumber var2){
        int dividend = var1.getDividend() * var2.getDividend();
        int divisor = var1.getDivisor() * var2.getDivisor();
        return new FractionNumber (dividend, divisor);
    }

    FractionNumber div(FractionNumber var1, FractionNumber var2){
        int dividend = var1.getDividend()*var2.getDivisor();
        int divisor = var1.getDivisor()*var2.getDividend();
        return new FractionNumber (dividend, divisor);
    }
  /*  FractionNumber parseFractionNumber(String var1) {
    *    return var1.toString();
    *}
    */

}
}
