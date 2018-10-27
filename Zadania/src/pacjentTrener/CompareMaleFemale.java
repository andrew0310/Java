package pacjentTrener;

import Student.Gender;

import java.util.Comparator;

public class CompareMaleFemale implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        if(p1.getGender() == Gender.FEMALE && p2.getGender() == Gender.MALE) return -1;
        if(p1.getGender() == Gender.FEMALE && p2.getGender() == Gender.FEMALE) return 0;
        if(p1.getGender() == Gender.MALE && p2.getGender() == Gender.FEMALE) return 1;

        return 0;
    }
}
