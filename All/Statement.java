import java.util.Scanner;

public class Statement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any Number :");
        num = input.nextInt();
        input.close();

        if (num > 0) {
            System.out.println("Positive");

        } else if (num < 0) {

            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }
    }

}
