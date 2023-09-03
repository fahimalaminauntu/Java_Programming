package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int num[][] = new int[2][3];
        num[0][0] = 10;
        num[0][1] = 13;
        num[0][2] = 103;
        num[1][0] = 105;
        num[1][1] = 104;
        num[1][2] = 106;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + num[row][col]);

            }
            System.out.println();
        }

    }

}
