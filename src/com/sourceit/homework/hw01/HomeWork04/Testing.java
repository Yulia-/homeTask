package com.sourceit.homework.hw01.HomeWork04;

/**
 * Created by Юля on 23.02.2015.
 */
public class Testing {
    public static void main(String[] args) {
        Person person1 = new Person("Carl Heap", 25, "M") ;

        Student student1 = new Student("Dazy Lincoln", 19, "F", "DK76409843", 4.2);

        Teacher teacher1 = new Teacher("Alice Black", 29, "F", 100000, "Politology");

        CollegeStudent collegeStudent1 = new CollegeStudent("Nick Stack", 18, "M", "KF12365478", 4.9, 2, "Mathematics");

        //int [] Person = new int [];
        Person p [] = {person1, student1, teacher1, collegeStudent1};

        for (int i=0; i<4; i++)
            System.out.println(p[i].toString());


    }
}
