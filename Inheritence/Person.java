package Inheritence;

public class Person {
    private String Name;
    private int Age;

    public Person() {
    }

    public Person(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.Age;
    }

    void displayinformation() {
        System.out.println("Name :" + getName());
        System.out.println("Age : " + getAge());
    }

}
