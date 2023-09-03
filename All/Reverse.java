import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter Any number=");
        num = input.nextInt();
        temp = num;
        input.close();
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        System.out.println("Reverse digit= " + sum);
    }

}
