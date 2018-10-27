package Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(Arrays.asList(3.5, 4.0, 4.5, 4.5, 3.0), "123", "Marcin", "Karta", Gender.MALE);
        Student student2 = new Student(Arrays.asList(3.0, 2.0, 3.5, 5.0, 3.0), "285", "Marta", "Krysa", Gender.FEMALE);
        Student student3 = new Student(Arrays.asList(2.0, 4.0, 4.5, 4.0, 2.5), "770", "Katarzyna", "Frose", Gender.FEMALE);
        Student student4 = new Student(Arrays.asList(3.0, 4.5, 4.5, 4.0, 2.0), "400", "Wiesław", "Wróbel", Gender.MALE);
        Student student5 = new Student(Arrays.asList(5.0, 4.0, 5.0, 4.5, 3.5), "065", "Jerzy", "Szwejca", Gender.MALE);

        List<StudentBook> studentBooks = new ArrayList<>();

        //System.out.println(studentBooks.getStudent("770"));
        //System.out.println(studentBooks.getAverage("400"));
    }
}
