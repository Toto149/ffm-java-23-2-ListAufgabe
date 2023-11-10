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
    public List<Course> findCourses(String id){
        for(Student student : students ){
            int i = students.indexOf(student);
            if(student.getId().equals(id)){
                return student.getCourseList();
            }
        }
        System.out.println("Dieser Student findet sich nicht an dieser Schule");
        return null;
    }
    public Student findStudent(String id){
        for(Student student: this.students){
            int i = this.students.indexOf(student);
            if(this.students.get(i).getId().equals(id)){
                return this.students.get(i);
            }
        }
        System.out.println("Diesen Studenten findet sich nicht in der Liste");
        return null;
    }


}
