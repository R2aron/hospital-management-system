package hospitalManagemantSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient extends Person{
    private String condition;
    private boolean admitted;
    private LocalDate admissionDate;

    protected Patient(String name, int age, String gender,String condition, boolean admitted, LocalDate admissionDate)
    {
        super(name, age, gender);
        this.condition = condition;
        this.admitted = admitted;
        if(isAdmitted())
        {
            admit(admissionDate);
        }
        else System.out.println("Patient not admitted");
    }

    protected void admit(LocalDate admisionDate)
    {
        this.admissionDate = admisionDate;
        System.out.println("Patient admited!");
    }

    protected void discharge(LocalDate dischargeTime)
    {
        if(dischargeTime.isAfter(admissionDate))
        {
            System.out.println("Invalid dischargeTime");
            return;
        }

        System.out.println("Discharge time for "+this.getName()+" "+ dischargeTime);

    }

    protected boolean isAdmitted()
    {
        return this.admitted;
    }

    protected String getCondition()
    {
        return this.condition;
    }

    protected LocalDate getAdmissionDate()
    {
        return this.admissionDate;
    }

    @Override
    protected void printDetails()
    {
        super.printDetails();
        System.out.println("\nCondition: "+this.condition+ "Admitted: "+this.admitted+"Admision date: "+this.condition);
    }




}
