package Array;

import java.util.ArrayList;

public class Arrayliist {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(35);
        number1.add(23);
        number1.add(69);
        number1.add(89);
        System.out.println("Number 1 = " + number1);
        System.out.println();

        number2.add(78);
        number2.add(56);
        number2.add(45);
        number2.add(100);
        System.out.println(" Number 2 =" + number2);
        System.out.println();

        number3.addAll(number2);
        System.out.println("Number 3 =" + number3);

    }

}
