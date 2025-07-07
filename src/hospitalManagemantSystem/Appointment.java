package hospitalManagemantSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.lang.

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private boolean confirmed;

    protected Appointment(Patient patient, Doctor doctor)
    {
        this.patient = patient;
        this.doctor = doctor;
    }

    private void schedule(LocalDateTime localDateTime)
    {
        if(patient.isAdmitted() && !(localDateTime.toLocalDate().equals(LocalDate.now())))
        {
            this.dateTime = localDateTime;
            System.out.println("Appointment set for "+this.dateTime+"\n Your doctor is "+this.doctor.getName()+ " Specialization: "+this.doctor.getSpecialization());
        }
        else System.out.println("You cand make an appointment from tomorrow");
    }

    private void cancel()
    {
        System.out.println("Apointment cancceled");
        this.confirmed = false;
        this.dateTime = null;
    }

    protected String printSummary()
    {
        return patient.printDetails() + doctor.printDetails() + "Apointement at "+ this.dateTime;
    }
}
