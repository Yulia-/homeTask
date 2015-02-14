package com.sourceit.homework.hw01.PersonalInfo;

/**
 * Created by Юля on 14.02.2015.
 */
public class PersonalInfo {

    long storage;

    public void setAge (int newAge) {
        setParam(newAge, 48);

    }

    public int getAge () {

        return getParam(48);
    }

    public void setParam (int newParam, int shift) {
        long mask = 0xffffl << shift;
        mask = ~mask;
        storage = storage & mask;

        long age = ((long) newParam) << shift;
        storage = storage | age;

    }

    public int getParam (int shift) {
        int i = (int) (storage >>> shift);
        i = i & 0xFFFF;
        return i;
    }


    public void setWeight (int newWeight) {
        setParam(newWeight, 32);
    }

    public int getWeight () {

        return getParam(32);
    }

    public void setHight (int newHight) {
        setParam(newHight, 16);
    }

    public int getHight () {

        return getParam(16);
    }

    public void setYear (int newYear) {
        setParam(newYear, 0);
    }

    public int getYear () {

        return getParam(0);
    }

}