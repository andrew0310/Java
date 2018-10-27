package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Double> marks;
    private final String indexNo;
    private final String name;
    private final String surname;


    public Student(List<Double> marks, String indexNo, String name, String surname, Gender gender) {
        this.marks = marks;
        this.indexNo = indexNo;
        this.name = name;
        this.surname = surname;

    }

    public Student(String indexNo, String name, String surname) {
        this.indexNo = indexNo;
        this.name = name;
        this.surname = surname;
        this.marks = new ArrayList<Double>();
    }

    public List<Double> getMarks() {
        return marks;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student.Student{" +
                "marks=" + marks +
                ", indexNo='" + indexNo + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
