public class Bitwise {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c;

        c = a & b;
        System.out.println("Bitwise and :" + c);
        c = a | b;
        System.out.println("Bitwise or :" + c);
        c = a ^ b;
        System.out.println("Bitwise Exor :" + c);
        c = a >> 2;
        System.out.println("Bitwise Shift Right :" + c);
        c = a << 3;
        System.out.println("Bitwise Shift Left :" + c);
    }

}
