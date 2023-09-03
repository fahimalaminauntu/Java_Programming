import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        System.out.print("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter second number :");
        num2 = input.nextInt();

        input.close();

        result = num1 + num2;
        System.out.println("Sum=" + result);

        result = num2 - num1;
        System.out.println("sub=" + result);

        result = num1 * num2;
        System.out.println("Multiplication=" + result);

        result = num1 / num2;
        System.out.println("Div =" + result);

        result = num2 % num1;
        System.out.println("Reminder=" + result);

    }
}