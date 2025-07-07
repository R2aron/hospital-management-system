package hospitalManagemantSystem;

public class Nurse extends Person{
    private String shift;

    protected Nurse(String name, int age, String gender, String shift)
    {
        super(name, age, gender);
        this.shift = shift;
    }

    protected void asisitDoctor(Doctor doctor)
    {
        System.out.println("Nurse "=this.getName()+" Asists doctor "+doctor.getName());
    }

    @Override
    protected String printDetails()
    {
        return super.printDetails()+"\nShift: "+this.shift;
    }
}
