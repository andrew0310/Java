package dentysta;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOperator {

    private final String PATIENTS_PATH = "src/dentysta/db/patients.txt";
    private final String SEPARATOR = ";";


    public void savePatients(Map<String, Patient> patientMap) {

        PrintWriter writer = null;

        try {
            PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(PATIENTS_PATH)));
            for (Patient value : patientMap.values()) {
                write.println(value);
            }
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("Operation failed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String toLine(Patient patient) {

        String result = "";
        result += patient.getName() + SEPARATOR;
        result += patient.getSurname() + SEPARATOR;
        result += patient.getPesel() + SEPARATOR;
        result += patient.getId();
        return result;
    }

  /*  public Map<String, Patient> readPatients() {

        Map<String, Patient> patientMap = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(PATIENTS_PATH));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //Patient patient = toPatient(line);
                patientMap.put(patient.getId(), patient);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return patientMap;
    }*/

    /*private Patient toPatient(String line) {

        String[] fields = line.split(";");
        String firstName = fields[0];
        String surname = fields[1];
        String pesel = fields[2];
        String id = fields[3];

        long number = Long.parseLong(id);
        id = fields[4];*/


        //Patient patient = new Patient(firstName, surname, pesel);
        //return patient;
    }

