package dentysta;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RegistrationDesk {

    private Map<String, Patient> patientMap;
    private Map<Integer, Visit> visitMap;
    private FileOperator fileOperator;

    public RegistrationDesk() {
        patientMap = new HashMap();
        visitMap = new HashMap();
        fileOperator = new FileOperator();
    }

   /* public Optional<Integer> register(Visit visit) {

        if (visitMap.containsKey(visit.getVisitID())) return Optional.empty();

        if (patientMap.containsKey(visit.getPatient().getId())) {
            Patient realPatient = patientMap.get(visit.getPatient().getId());
            visit.setPatient(realPatient);

            visitMap.put(visit.getVisitID(), visit);
            return Optional.ofNullable(visit.getVisitID());
        }
        return Optional.empty();
    }*/

    public boolean addPatient(Patient patient) {

        if (patientMap.containsKey(patient.getId())) {
            System.out.println("Sorry, this patient is already in database.\n Add another patient.");
            return false;
        } else {
            patientMap.put(patient.getId(), patient);
            return true;
        }
    }

    public void printPatients(){
        System.out.println(patientMap);
    }

    public void printVisits(){
        System.out.println(visitMap);
    }
}
