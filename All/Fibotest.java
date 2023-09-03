import java.util.Scanner;

public class Fibotest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f = 0, s = 1, fibo = 0, n;
        System.out.println("enter which fibonacci num you see");
        n = input.nextInt();
        input.close();

        for (int i = 3; i <= n; i++) {
            fibo = f + s;
            f = s;
            s = fibo;
        }
        System.out.println(fibo);

    }

}
