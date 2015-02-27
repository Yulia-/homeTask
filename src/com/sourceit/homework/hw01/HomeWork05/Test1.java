package com.sourceit.homework.hw01.HomeWork05;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Юля on 27.02.2015.
 */
public class Test1 implements FractionNumber {
    int dividend;
    int divisor;

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
}
