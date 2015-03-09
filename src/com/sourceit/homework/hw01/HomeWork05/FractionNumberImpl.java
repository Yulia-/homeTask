package com.sourceit.homework.hw01.HomeWork05;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Юля on 28.02.2015.
 */
public class FractionNumberImpl implements com.sourceit.hometask.basic.FractionNumber {
    private int dividend;
    private int divisor = DEFAULT_DIVISOR_VALUE;

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

    @Override
    public String toString(){
        return
                dividend + "/" + divisor;
    }

    @Override
    public double doubleValue() {

        return ((double)dividend/divisor);
    }

    @Override
    public int compareTo(FractionNumber obj) {
        if(doubleValue()<obj.doubleValue()) {
            return -1;
        }
        else if (doubleValue()>obj.doubleValue()){
            return 1;
        }
        return 0;
    }

}


