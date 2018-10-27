package StudentSaveToFile;

import Student.Student;

import java.io.*;
import java.util.List;

public class SaveFormatTwo implements Operator {

    final Saving saving = new Saving(this);


    public void saveToFile(List<Student> studentList) throws IOException {

        saving.saveToFile(studentList);
    }

    public String formatTwo(Student student) {

        String result = "";

        result += student.toString();

        return result;
    }
}


