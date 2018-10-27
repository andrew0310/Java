package StudentSaveToFile;

import Student.Student;

import java.io.IOException;
import java.util.List;

public interface Operator {

    void saveToFile(List<Student> studentList) throws IOException;
}
