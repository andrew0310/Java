package comparatorTask;

import java.util.Comparator;

public class CompareNamesAndSurnames implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {

        int lastNameComparingResult = p1.getLastName().compareTo(p2.getLastName());
        if (lastNameComparingResult != 0) return lastNameComparingResult;

        int firstNameComparingResult = p1.getFirstname().compareTo(p2.getFirstname());
        return firstNameComparingResult;

    }
}

