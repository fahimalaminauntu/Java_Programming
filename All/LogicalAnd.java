import java.util.Scanner;

public class LogicalAnd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter Any Letter :a");
        ch = input.next().charAt(0);
        input.close();
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Letter ");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");

        } else {
            System.out.println("Not A Leter");
        }
    }

}
