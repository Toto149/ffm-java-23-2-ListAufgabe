package org.example;


import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;

    public School(){

    }
    public School(List<Student> students){
        this.students = students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudent(){
        System.out.println(students);
    }
    public void layOffStudent(Student student){
        students.remove(student);
    }
    public Student findStudent(String matrikelnummer){
        for(Student student: this.students){
            int i = this.students.indexOf(student);
            if(this.students.get(i).getMatrikelnummer().equals(matrikelnummer)){
                return this.students.get(i);
            }
        }
        System.out.println("Diesen Studenten findet sich nicht in der Liste");
        return null;
    }

}
