
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner number = new Scanner (System.in);
      System.out.println ("Enter a number= ");
    int a = number.nextInt ();
    for (int i = 1; i <= 10; i++)
      {
	System.out.println ("i*a= " + i * +a);
      }

  }
}
