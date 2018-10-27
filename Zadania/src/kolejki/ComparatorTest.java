package kolejki;

import dentysta.Patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Johny", "Cash", 58464643134L);
        Patient patient2 = new Patient("Martin", "Shmitt", 456432213444L);
        Patient patient3 = new Patient("Andrzej", "Gołota", 986565413322L);
        Patient patient4 = new Patient("Wojciech", "Szczęsny", 241212133206556L);
        Patient patient5 = new Patient("Tomasz", "Sikora", 78431056554L);

        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);

        System.out.println(patientList);
        Collections.sort(patientList,new MyPatientComparator());
        System.out.println(patientList);
    }
}
