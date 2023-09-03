import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
        System.out.println("Enter Last Number :");
        n = input.nextInt();
        input.close();
        for (int i = 1; i <= n; i = i + 2) {

            result = result * i * i;
        }

        System.out.println(result);

    }

}
