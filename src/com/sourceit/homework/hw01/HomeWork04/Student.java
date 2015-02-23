package com.sourceit.homework.hw01.HomeWork04;

/**
 * Created by Юля on 23.02.2015.
 */
public class Student extends Person {
    String idNumber;
    double gpa;

    Student(String name, int age, String gender, String idNumber, double gpa){
        super (name, age, gender);
        setIdNumber (idNumber);
        setGpa (gpa);
    }

    public void setIdNumber(String newIdNumber){
        idNumber = newIdNumber;
    }
    public void setGpa(double newGpa){
        gpa = newGpa;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return super.toString() +", " + "ID number: " + getIdNumber() + ", gpa: " + getGpa();
    }
}
