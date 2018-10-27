package comparatorTask;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Johny", "Cash", (LocalDate.now().minus(54, ChronoUnit.YEARS).minus(4, ChronoUnit.MONTHS).minus(13, ChronoUnit.DAYS)));
        Person person2 = new Person("Carter", "Rawss", (LocalDate.now().minus(30, ChronoUnit.YEARS).minus(6, ChronoUnit.MONTHS).minus(2, ChronoUnit.DAYS)));
        Person person3 = new Person("Will", "Tuyds", (LocalDate.now().minus(26, ChronoUnit.YEARS).minus(7, ChronoUnit.MONTHS).minus(5, ChronoUnit.DAYS)));
        Person person4 = new Person("Mary", "Eros", (LocalDate.now().minus(85, ChronoUnit.YEARS).minus(5, ChronoUnit.MONTHS).minus(3, ChronoUnit.DAYS)));
        Person person5 = new Person("Leodith", "Miunf", (LocalDate.now().minus(33, ChronoUnit.YEARS).minus(1, ChronoUnit.MONTHS).minus(22, ChronoUnit.DAYS)));
        Person person6 = new Person("Martin", "Routh", (LocalDate.now().minus(12, ChronoUnit.YEARS).minus(2, ChronoUnit.MONTHS).minus(9, ChronoUnit.DAYS)));
        Person person7 = new Person("Kate", "Mairt", (LocalDate.now().minus(7, ChronoUnit.YEARS).minus(4, ChronoUnit.MONTHS).minus(17, ChronoUnit.DAYS)));
        Person person8 = new Person("Martith", "Claie", (LocalDate.now().minus(123, ChronoUnit.YEARS).minus(3, ChronoUnit.MONTHS).minus(56, ChronoUnit.DAYS)));
        Person person9 = new Person("Alex", "Cassidy", (LocalDate.now().minus(12, ChronoUnit.YEARS).minus(9, ChronoUnit.MONTHS).minus(8, ChronoUnit.DAYS)));
        Person person10 = new Person("Jason", "Burns", (LocalDate.now().minus(26, ChronoUnit.YEARS).minus(5, ChronoUnit.MONTHS).minus(3, ChronoUnit.DAYS)));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        CompareNames compareNames = new CompareNames();

        System.out.println(compareNames.compare(person1, person2));

    }
}
