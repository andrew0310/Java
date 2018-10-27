package StudentSaveToFile;

import Student.Student;

import java.io.*;
import java.util.List;

public class SaveFormatOne implements Operator {

    final String FILEPATH = "C:\\Users\\abial\\IdeaProjects\\ProgramowanieII\\src\\main\\java\\StudentSaveToFile\\StudentListFile.txt";
    final String SEPARATOR = ";";


    public void saveToFile(List<Student> studentList) throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH)));
            for (Student student : studentList) {
                writer.println(formatOne(student));
                writer.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation failed.");
            e.printStackTrace();
        }
    }

    private String formatOne(Student student) {

        String result = "";

        result += student.getName() + SEPARATOR;
        result += student.getSurname() + SEPARATOR;
        result += student.getAge() + SEPARATOR;
        result += student.getId() + SEPARATOR;

        return result;
    }
}

