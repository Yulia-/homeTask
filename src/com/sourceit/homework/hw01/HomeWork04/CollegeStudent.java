package com.sourceit.homework.hw01.HomeWork04;

/**
 * Created by Юля on 23.02.2015.
 */
public class CollegeStudent extends Student {
    int year;
    String major;
    CollegeStudent ( String name, int age, String gender, String idNumber, double gpa, int year, String major ){
        super(name, age, gender, idNumber, gpa);
        setYear (year);
        setMajor (major);
    }
    public void setYear(int newYear){
        year = newYear;
    }
    public void setMajor (String newMajor){
        major = newMajor;
    }
    public int getYear(){
        return year;
    }
    public String getMajor(){
        return major;
    }
    public String toString (){
        return super.toString() + ", " + "year: " + getYear() + ", major: " + getMajor();
    }
}
