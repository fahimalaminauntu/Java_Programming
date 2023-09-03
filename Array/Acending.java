package Array;

import java.util.Arrays;

public class Acending {
    public static void main(String[] args) {
        int[] number = { 1, 5, -8, -27, 35 };
        Arrays.sort(number);
        System.out.println("Acending :");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + number[i]);

        } // Decending

        System.out.println();

        System.out.println("Decending :");
        for (int i = 4; i >= 0; i--) {
            System.out.println("  " + number[i]);
        }
    }

}
