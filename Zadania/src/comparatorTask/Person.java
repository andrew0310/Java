package comparatorTask;

import java.time.LocalDate;

public class Person {

    String firstname;
    String lastName;
    LocalDate dateOfBirth;

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Person(String firstname, String lastName, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;


    }
}
