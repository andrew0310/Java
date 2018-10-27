package StudentSaveToFile;

import Student.Student;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {

        Dziekanat dziekanat = new Dziekanat(new ArrayList());

        Student maciej = new Student("Maciej", "Kowalski",2700156,27 );
        Student krzystof = new Student("Krzysztof", "Jaskólski",556924,23 );
        Student krysia = new Student("Krystyna", "Zgazowni",1295506,19 );
        Student basia = new Student("Barbara", "Komar",2336978,20 );

        dziekanat.addStudent(maciej);
        dziekanat.addStudent(krysia);
        dziekanat.addStudent(krzystof);
        dziekanat.addStudent(basia);
   }
}
