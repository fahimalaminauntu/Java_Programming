import java.util.Scanner;

public class VawelConsonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter Any Leter :");
        ch = input.next().charAt(0);
        input.close();

        if (ch == 'a') {

            System.out.println("Vawel");
        } else if (ch == 'e') {

            System.out.println("Vawel");
        } else if (ch == 'i') {
            System.out.println("Vawel");

        } else if (ch == 'o') {
            System.out.println("Vawel");
        } else if (ch == 'u') {
            System.out.println("Vawel");
        } else {
            System.out.println("Consonent");
        }

    }

}