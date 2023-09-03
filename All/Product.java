import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int id;
        String title;
        double price;
        String Description;
        String Catagory;
        System.out.print("Enter id :");
        id = input.nextInt();

        System.out.println("Enter title :");
        title = input.nextLine();

        System.out.println("Enter price :");
        price = input.nextDouble();

        System.out.println("Enter Description :");
        Description = input.nextLine();

        System.out.println("Enter Catagogy :");
        Catagory = input.nextLine();
        input.close();
        System.out.println("\nThe product");
        System.out.println("id :" + id);
        System.out.println("title:" + title);
        System.out.println("price :" + price);
        System.out.println("Description :" + Description);
        System.out.println("Catagogy :" + Catagory);

    }

}
