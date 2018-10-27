package comparatorTask;

import java.util.Comparator;

public class CompareNames implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {

        String p1Name = p1.getFirstname();
        String p2Name = p2.getFirstname();

        return p1Name.compareTo(p2Name);
    }
}
