package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Miroslav","Klose", "12345");
        Student student2 = new Student("John", "von Neumann", "23456");
        Student student3 = new Student("Ada","Lovelace","34567");

        List<Student> schoolClass = new ArrayList<>();
        schoolClass.add(student1);
        schoolClass.add(student2);
        schoolClass.add(student3);
        School school = new School(schoolClass);
        System.out.println(school.findStudent("12345"));

    }
}