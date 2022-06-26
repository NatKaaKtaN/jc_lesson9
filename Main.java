package lesson99;

import java.util.ArrayList;
import java.util.List;
import static lesson99.Education.*;


public class Main {
    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass("Volkov", "GEOGRAPHY, HISTORY"));
        students.add(new StudentClass("Zajcev", "MEDICINE, PHYSICS, MATHEMATICS"));
        students.add(new StudentClass("Medvedev", "HISTORY"));
        students.add(new StudentClass("Sokolov", "GEOGRAPHY, MATHEMATICS"));
        students.add(new StudentClass("Kotikova", "MEDICINE"));
        students.add(new StudentClass("Homjakova", "GEOGRAPHY, HISTORY, MATHEMATICS"));

        students.stream().forEach(System.out::println);

        System.out.println(" 1 ");
        System.out.println(upr1(students));
        System.out.println(students.stream());

        System.out.println(" 2 ");
        upr2(students).stream().forEach(System.out::println);

        System.out.println(" 3 ");
        String COURSE_NAME = "HISTORY";
        upr3(students,COURSE_NAME).stream().forEach(System.out::println);

    }
}

