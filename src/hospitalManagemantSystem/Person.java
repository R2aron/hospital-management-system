package hospitalManagemantSystem;

public class Person {
    private String name;
    private int age;
    private String gender;


    protected Person(String name, int age, String gender)
    {
        this.name = name;
        this. age = age;
        this. gender = gender;
    }



    protected String getName()
    {
        return this.name;
    }

    protected String printDetails(){
        return "\nName: "+ this.name+"\nAge: "+ this.age+"\nGender: "+this.gender;
    }
}
