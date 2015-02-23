package com.sourceit.homework.hw01.HomeWork04;

/**
 * Created by Юля on 23.02.2015.
 */
public class Teacher extends Person {
    double salary;
    String subject;

    Teacher (String name, int age, String gender, double salary, String subject){
        super (name, age, gender);
        setSalary (salary);
        setSubject(subject);
    }

    public void setSalary (double newSalary){
        salary = newSalary;
    }
    public void setSubject (String newSubject){
        subject = newSubject;
    }
    public double getSalary (){
        return salary;
    }
    public String getSubject(){
        return subject;
    }
    public String toString (){
        return super.toString() + ", " + "salary: " + getSalary() + "subject: " + getSubject();
    }

}
