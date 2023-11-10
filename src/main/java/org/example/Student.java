package org.example;

import java.util.List;
import java.util.Objects;

public class Student {
    private String firstname;
    private String surname;
    private String id;

    private List<Course> courseList;

    public Student(){

    }
    public Student(String firstname, String surname, String id) {
        this.firstname = firstname;
        this.surname = surname;
        this.id = id;
    }
    public Student(String firstname, String surname, String id, List<Course> courseList) {
        this.firstname = firstname;
        this.surname = surname;
        this.id = id;
        this.courseList = courseList;
    }
    public void addToCourse(Course course){
        this.courseList.add(course);

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(surname, student.surname) && Objects.equals(id, student.id) && Objects.equals(courseList, student.courseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname, id, courseList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
