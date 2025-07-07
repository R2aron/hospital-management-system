package hospitalManagemantSystem;

public class Doctor extends Person{
    private String specialization;
    private int experience;


   protected Doctor(String name, int age, String gender, String specialization, int experience)
   {
       super(name, age, gender);
       this.specialization = specialization;
       this.experience = experience;
   }

   protected void diagnose(Patient patient)
   {
       System.out.println("Patient "+ patient.getName() + " is diagnosed with "+ patient.getCondition())//sau setCondition?;
   }

   protected String getName()
   {
       return getName();
   }
   protected String getSpecialization()
   {
       return this.specialization;
   }

    @Override
    protected void printDetails()
    {
        super.printDetails();
        System.out.println("\nSpecialization: "+ this.specialization+"\nExperience: "+this.experience);
    }
}
