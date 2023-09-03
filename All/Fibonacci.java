import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Numbers:");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        input.close();
        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            System.out.println(" " + fibo);
            first = second;
            second = fibo;
        }

    }

}
