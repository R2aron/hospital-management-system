package hospitalManagemantSystem;

import javax.swing.*;

public class HospitalService {

    protected double generateBill(Patient patient, int service)
    {
        System.out.println("\n1 --> General Consultation\n2 --> Surgery\n3 --> ICU Admission" +
                "\n4 --> Emergency Handling\n5 --> Lab Tests\n6 --> X-Ray");

       return handleService(service);

    }

    protected double generateBill(Patient patient, int[] services)
    {
        double sum=0;
        for(int serviceNumber: services)
        {
            sum+=handleService(serviceNumber);
        }

        return sum;
    }

    protected double handleService(int code)
    {

        switch (code) {

            case 1:
                System.out.println("Doctor will meet patient shortly.");
                return 50;
            break;
            case 2:
                System.out.println("Be ready for surgery!");
                return 1500;
                break;;
            case 3:
                System.out.println("ICU admitted");
                return 500;
                break;
            case 4:
                System.out.println("Dispatching emergency response team.");
                return 250;
                break;
            case 5:
                System.out.println("Do not eat before!");
                return 100:
                break;
            case 6:
                System.out.println("Remove all your metal items from your body before x-ray!");
                return 200;
                break;

            default:
                return 100;
                break;
        }
    }

   protected void monnitoringTemperature(double temp)
    {
        StringBuilder message = new StringBuilder();
        while(true)
        {
            message.append((temp > 39.5) ? "High fever warning" : ((temp >= 38 && temp <= 39.5) ? "Elevated temperature - mild fever": ((temp >= 38 && temp <= 39.5)? "Borderline - keep monitoring" :((temp <= 37.5) ? "Normal" : null))));
            System.out.println(message);
            if(message.equals(null))
                break;
        }
    }

    protected void checkPulse(int bpm)
    {
        do {
            if(bpm > 39.5)
                System.out.println("High fever warning");
            else if(bpm >= 38 && bpm <= 39.5)
                System.out.println("Elevated temperature - mild fever");
            else if(bpm >= 37.5 && bpm <= 38)
                System.out.println("Borderline - keep monitoring");
            else if(bpm <= 37.5)
                System.out.println("Normal");
            else if(bpm == 0)
                break;
        }while (true);
    }

    protected void checkAdmissions(Patient[] patients)
    {
        for(Patient patient: patients)
        {
            if(patient.isAdmitted())
                System.out.println("Admission date:"+ patient.getAdmissionDate());
            else System.out.println("Patient "+ patient.getName()+ " is not admited");
        }
    }

    protected void processServices(Patient patient, String[] services) {
        int i = 0;
        if (services.length == 0) {
            System.out.println("No services requested for patient : " + patient.getName());
            return;
        }
        do {
            String service = services[i];
            System.out.println("Processing services: " + service + " for patient: " + patient.getName());
            i++;
        } while (i < services.length);
    }

}
