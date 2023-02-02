public class Student {
    String Name;
    int Age;
    float CGPA;

    void display() {
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(CGPA);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.Name = "Auntu";
        obj.Age = 22;
        obj.CGPA = 3.63f;
        obj.display();
    }
}