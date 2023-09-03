import java.util.Scanner;

public class LogicalAand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;
        System.out.print("Have You completed your masters?");
        ch1 = input.next().charAt(0);
        System.out.println("Are you fluent in English?");
        ch2 = input.next().charAt(0);
        input.close();
        if (ch1 == 'y' && ch2 == 'y') {
            System.out.println(" 'Congratulation!' You are eligible for the job");
        } else {
            System.out.println("You are not eligible for the job");
        }

    }

}
