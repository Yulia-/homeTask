package com.sourceit.homework.hw01.HomeWork05;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Юля on 28.02.2015.
 */
public class FractionNumberOperationImpl implements com.sourceit.hometask.basic.FractionNumberOperation {

        public FractionNumberImpl add(FractionNumber var1, FractionNumber var2) {
            FractionNumberImpl addition = new FractionNumberImpl();
            addition.setDividend (var1.getDivisor() * var2.getDividend() + var2.getDivisor() * var1.getDividend());
            addition.setDivisor (var1.getDivisor() * var2.getDivisor());
            return addition;
        }

        public FractionNumberImpl sub(FractionNumber var1, FractionNumber var2){
            FractionNumberImpl subtraction = new FractionNumberImpl();
            subtraction.setDividend (var2.getDivisor() * var1.getDividend() - var1.getDivisor() * var2.getDividend());
            subtraction.setDivisor(var1.getDivisor() * var2.getDivisor());
            return subtraction;
        }

        public FractionNumberImpl mul(FractionNumber var1, FractionNumber var2){
            FractionNumberImpl multiplication = new FractionNumberImpl();
            multiplication.setDividend(var1.getDividend() * var2.getDividend());
            multiplication.setDivisor(var1.getDivisor() * var2.getDivisor());
            return multiplication;
        }

        public FractionNumberImpl div(FractionNumber var1, FractionNumber var2){
            FractionNumberImpl division = new FractionNumberImpl();
            division.setDividend(var1.getDividend()*var2.getDivisor());
            division.setDivisor(var1.getDivisor()*var2.getDividend());
            return division;
        }

        @Override
        public FractionNumber parseFractionNumber(String s) {
            FractionNumberImpl parse = new FractionNumberImpl();
            int index= s.indexOf('/');
            if(index ==-1) {
                parse.setDividend(Integer.valueOf(s));
                parse.setDivisor(1);
            } else {
                String dividend = s.substring(0, index);
                String divisor = s.substring(index, s.length());

                parse.setDividend(Integer.valueOf(dividend));
                parse.setDivisor(Integer.valueOf(divisor));
                return parse;
            }

            return parse;
        }


}
