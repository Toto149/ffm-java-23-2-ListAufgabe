package org.example;

import java.util.Objects;

public class Course {

    private String coursename;
    private String teacher;
    private String courseRoom;

    public Course(){

    }

    public Course(String coursename, String teacher, String courseRoom) {
        this.coursename = coursename;
        this.teacher = teacher;
        this.courseRoom = courseRoom;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(coursename, course.coursename) && Objects.equals(teacher, course.teacher) && Objects.equals(courseRoom, course.courseRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coursename, teacher, courseRoom);
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", teacher='" + teacher + '\'' +
                ", courseRoom='" + courseRoom + '\'' +
                '}';
    }
}
