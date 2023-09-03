import java.util.Scanner;

public class op {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Double num1;
            System.out.println("Enter any Number");
            num1 = input.nextDouble();
            System.out.println(num1);
        }

    }

}
