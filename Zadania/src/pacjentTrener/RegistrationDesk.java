package pacjentTrener;

import java.util.*;

public class RegistrationDesk {
    private Map<String, Patient> patientMap;
    private Map<String, Visit> visitMap;
    private FileOperator fileOperator;
    Queue<Patient> patientQueue;


    public RegistrationDesk() {
        visitMap = new HashMap<>();
        fileOperator = new FileOperator();
        patientMap = fileOperator.readPatients();
        patientQueue = new PriorityQueue<>();
    }

    public boolean addPatient(Patient patient) {

        if (patientMap.containsKey(patient.getId())) {
            System.out.println("Patient exists!");
            return false;
        }
        patientMap.put(patient.getId(), patient);
        fileOperator.savePatients(patientMap);
        return false;
    }

    public Optional<String> register(Visit visit) {
        if (visitMap.containsKey(visit.getId())) return Optional.empty();

        if (patientMap.containsKey(visit.getPatient().getId())) {

            Patient realPatient = patientMap.get(visit.getPatient().getId());
            visit.setPatient(realPatient);

            visitMap.put(visit.getId(), visit);
            return Optional.ofNullable(visit.getId());
        } else return Optional.empty();
    }

    public void printPatients() {
        System.out.println(patientMap);
    }

    public void printVisits() {
        System.out.println(visitMap);
    }

    public boolean addPatientToQueue(Patient patient) {

        if (patientMap.containsKey(patient.getId())) {
            patientQueue.add(patient);
            return true;
        }
        return false;
    }

    public Optional<Patient> getNextPatient() {

        return Optional.ofNullable(patientQueue.poll());

/*        Patient probablyPatient = patientQueue.poll();
        if (probablyPatient != null)*/
    }
}

