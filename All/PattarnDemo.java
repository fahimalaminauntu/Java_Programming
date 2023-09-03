import java.util.Scanner;

public class PattarnDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int n = input.nextInt();
        input.close();
        for (int row = 1; row >= n; row++) { // - use then reverse row=n & row>=1 row--
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

}
