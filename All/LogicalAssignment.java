import java.util.Scanner;

public class LogicalAssignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love java?");
        ch = input.next().charAt(0);
        input.close();

        if (ch == 'y' || ch == 'Y') {
            System.out.println("You are a java lover");
        } else if (ch == 'z' || ch == 'Z') {
            System.out.println("You are not a java Lover");
        } else {
            System.out.println("Wrong input!");
        }
    }

}
