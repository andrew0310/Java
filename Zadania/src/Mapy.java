import Student.Student;

import java.util.*;

public class Mapy {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Student student = new Student("163", "Andrzej", "Kraszewski");

        for (Student student1 : list) {
            if (student.getIndexNo().equals("jakiesID"));
        }

        Map<String, Student> map = new HashMap<>();

        map.put(student.getIndexNo(), student);

        Set<String> keys = map.keySet();
        System.out.println(map);
    }
}
