import java.util.Scanner;

public class ArmstroneDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter Any Number:");
        num = input.nextInt();
        temp = num;
        input.close();
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }
        if (sum == num) {
            System.out.println("Armstrome");
        } else {
            System.out.println("Not Armstrone");
        }
    }
}