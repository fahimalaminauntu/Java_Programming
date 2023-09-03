public class Increment {

    public static void main(String[] args) {

        
          int x=50;
          int y;
          y=x++;
          System.out.println("y="+y); // Pre increment
          y=x;
          System.out.println("y="+y);
         
        //int y = 25;
        int z;
        z = --y;
        System.out.println("z=" + y);
        z = y++;
        System.out.println("z=" + z);
        z = y;
        System.out.println("z=" + y);
        z = y++;
        System.out.println("z=" + z);
        z = y;
        System.out.println("z=" + z);
    }

}