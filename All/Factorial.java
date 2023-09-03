import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, fact = 1;
        System.out.println("Enter A Number:");
        n = input.nextInt();
        input.close();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial number of n=" + fact);
    }

}
