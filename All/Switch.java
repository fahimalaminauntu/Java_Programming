import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OPTION;
        System.out.print("Enter Any Option :");
        OPTION = input.nextInt();
        input.close();

        switch (OPTION) {
            case 1:
                System.out.println("Language is Bengali");
                break;
            case 2:
                System.out.println("Language is hindi");
                break;
            case 3:
                System.out.println("Language is urdu");
                break;

            case 4:
                System.out.println("Language is English");
                break;

            default:
                System.out.println("Not a language");

        }
    }

}
