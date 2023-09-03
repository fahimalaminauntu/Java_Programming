import java.util.Scanner;

public class Primetest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, numberofPrime = 0;
        System.out.print("Enter First mumber:");
        m = input.nextInt();
        System.out.print("Enter Last Number:");
        n = input.nextInt();
        input.close();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
                numberofPrime++;
            }
            count = 0;
        }
        System.out.println("Number of prime:" + numberofPrime);
    }

}
