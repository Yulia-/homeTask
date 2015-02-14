package com.sourceit.homework.hw01.PersonalInfo;

/**
 * Created by Юля on 14.02.2015.
 */
public class MainPerson {
    public static void main (String [] args){

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAge(24);
        System.out.println(personalInfo.getAge());
        personalInfo.setWeight(55);
        System.out.println(personalInfo.getWeight());
        personalInfo.setHight(173);
        System.out.println (personalInfo.getHight ());
        personalInfo.setYear(2000);
        System.out.println (personalInfo.getYear ());
    }
}
