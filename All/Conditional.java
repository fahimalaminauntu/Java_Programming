import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {


         Scanner input = new Scanner(System.in);
         int num1,num2,Large;
         System.out.print("Enter Two Numbers :");
         num1=input.nextInt();
         num2=input.nextInt();
         input.close();
        
         Large = (num1>num2) ? num1 : num2;
         System.out.println("Large number ="+Large);


        
        
    }
    
}
