package StudentSaveToFile;

import Student.Student;

import java.io.IOException;
import java.util.List;

public class Dziekanat {

    Operator operator;
    private List<Student> studentList;

    public Dziekanat(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void save() throws IOException {
        operator.saveToFile(studentList);
    }
}
