//Using Constructor.
package OP;

public class Employeee {
    int Id;
    String Name;

    // Create a class constructor for the Employee class.
    public Employeee(int I, String N) {
        this.Id = I;
        this.Name = N;
    }

    // Display Name & Id.
    void info() {
        System.out.println("Name : " + Name);
        System.out.println("Id : " + Id);
    }

    // Main method.
    public static void main(String[] args) {
        // Create an object of class Employee Which will call the constructor.
        Employeee emp = new Employeee(4672, "Auntu");
        emp.info();
    }
}