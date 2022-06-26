package lesson99;

import java.util.ArrayList;
import java.util.List;

public class StudentClass implements Student{
    private String name;
    private List<Course> courses;

    public StudentClass(String name, String courses) {
        this.name = name;
        this.courses = new ArrayList<>();
        for (String i: courses.split(", ")) {
            this.courses.add(new CourseClass(i));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getAllCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "Студент " + name + '\'' +
                ", обучается на курсах " + courses +
                '}';
    }
}
