import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random Rand = new Random();
        int randomNumber = Rand.nextInt(10) + 1;
        System.out.println(" number =" + randomNumber);

    }

}
