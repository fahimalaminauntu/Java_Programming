import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter Age :");
        age = input.nextInt();
        input.close();
        if (age >= 18) {
            System.out.println("Valid Voter");
        } else {
            System.out.println("Invalid Voter");
        }

    }

}
