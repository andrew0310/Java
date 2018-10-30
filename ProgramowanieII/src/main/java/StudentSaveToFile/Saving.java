package StudentSaveToFile;


import Student.Student;

import java.io.*;
import java.util.List;

public class Saving {

    final String FILEPATH = "/home/andrzej/Java/ProgramowanieII/src/main/java/StudentSaveToFile/StudentListFile";

    public Saving(SaveFormatTwo saveFormatTwo) {
    }


    public void saveToFile(List<Student> list) throws IOException {

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH)));
            for (Student s : list) {
                writer.println(s);
                writer.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation failed.");
            e.printStackTrace();
        }
    }
}