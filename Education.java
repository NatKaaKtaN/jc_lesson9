package lesson99;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Education {
    public static Set<String> upr1(List<StudentClass> students) {
        return students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x -> x.stream())
                .map(x -> x.toString())
                .collect(Collectors.toSet());
    }

    public static List<Student> upr2 (List<StudentClass> students) {
        List<Student> res = students.stream()
                .sorted((x, y) -> (int) (y.getAllCourses().size() - x.getAllCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
        return res;
    }

    public static List<Student> upr3 (List<StudentClass> students, String toFind) {
        List<Student> res = students.stream()
                .filter(x -> x.getAllCourses().toString().contains(toFind))
                .collect(Collectors.toList());
        return res;

    }
}