package Inheritence;

public class Teacher extends Person {
    private String Qualification;

    public Teacher(String Name, int Age, String Qualification) {
        super(Name, Age);
        this.Qualification = Qualification;
    }

    public String getQualification() {
        return this.Qualification;
    }

    @Override
    void displayinformation() {
        System.out.println("\nName :" + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Qualification : " + getQualification());

    }
}