package dentysta;

import java.util.UUID;

public class Patient {

    private String id;
    private String name;
    private String surname;
    private long pesel;

    public Patient(String name, String surname, long pesel) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
