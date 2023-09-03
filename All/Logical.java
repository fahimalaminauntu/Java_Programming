import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter Any Leter :");
        ch = input.next().charAt(0);
        input.close();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print("Vawel");
        } else {
            System.out.println("Consonent");
        }

    }

}
