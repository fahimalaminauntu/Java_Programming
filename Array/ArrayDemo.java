package Array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] opp = new double[5];
        double sum = 0;

        System.out.print("Enter 5 number:");
        for (int i = 0; i < 5; i++) {
            opp[i] = input.nextDouble();

        }
        for (int i = 0; i < 5; i++) {
            sum = sum + opp[i];
        }
        System.out.println("Sum is=" + sum);
        System.out.println("Avg is=" + sum / 5);
        double max = opp[0];
        double min = opp[0];
        for (int i = 1; i < 5; i++) {
            if (max < opp[i]) {
                max = opp[i];
            }
            if (min > opp[i]) {
                min = opp[i];
                input.close();
            }
        }
        System.out.println("Maximum is=" + max);
        System.out.println("Minimum is=" + min);
    }

}
