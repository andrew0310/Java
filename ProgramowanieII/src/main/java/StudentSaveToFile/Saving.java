package StudentSaveToFile;


import java.io.*;
import java.util.List;

public class Saving {

    final String FILEPATH = "C:\\Users\\abial\\IdeaProjects\\ProgramowanieII\\src\\main\\java\\StudentSaveToFile\\StudentListFile.txt";


    public void saveToFile(List<String> list) throws IOException {

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH)));
            for (String s : list) {
                writer.println(s);
                writer.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation failed.");
            e.printStackTrace();
        }
    }
}