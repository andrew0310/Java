package dentysta;

import java.util.Map;
import java.util.UUID;

public class Visit {

    private String visitID;
    private double visitPrice;
    private String DoctorNameSurname;
    private String visitDate;
    private Patient patient;

    public Visit(double visitPrice, String doctorNameSurname, String visitDate, Patient patient) {
        visitID = UUID.randomUUID().toString();
        this.visitPrice = visitPrice;
        this.DoctorNameSurname = doctorNameSurname;
        this.visitDate = visitDate;
        this.patient = patient;
    }

    public Visit(){
    }

    public String getVisitID() {
        return visitID;
    }

    public double getVisitPrice() {
        return visitPrice;
    }

    public String getDoctorNameSurname() {
        return DoctorNameSurname;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public Patient getPatient(){
        return patient;
    }

    public void setVisitID(String visitID) {
        this.visitID = visitID;
    }

    public void setVisitPrice(double visitPrice) {
        this.visitPrice = visitPrice;
    }

    public void setDoctorNameSurname(String doctorNameSurname) {
        DoctorNameSurname = doctorNameSurname;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
