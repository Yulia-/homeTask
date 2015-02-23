package com.sourceit.homework.hw01.HomeWork04;

/**
 * Created by Юля on 23.02.2015.
 */
public class Person {
    String name;
    int age;
    String gender;

    Person (String name, int age, String gender){

        setName (name);
        setAge (age);
        setGender (gender);
    }

    public String toString() {
        return getName() + ", " + "age: " + getAge() + ", gender: " + getGenger();
    }

    public void setName(String newName) {

        name = newName;
    }

    public void setAge(int newAge) {
        
        age = newAge;
    }

    public void setGender(String newGender) {

        gender = newGender;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getGenger() {
        return gender;
    }
}
