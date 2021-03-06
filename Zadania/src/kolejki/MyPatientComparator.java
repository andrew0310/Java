package kolejki;

import dentysta.Patient;

import java.util.Comparator;

public class MyPatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        if(p1.getPesel() > p2.getPesel()) return 1;
        if (p1.getPesel() < p2.getPesel()) return -1;
        return 0;
    }
}
