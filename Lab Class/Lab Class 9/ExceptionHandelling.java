
public class Exception {
    public static void main(String[] args) {
        int[] a = new int[5];
        String S = null;
        String A = "ABC";

        try {
            a[2] = 10 / 0; 
            System.out.println("Access Element Three" + a[5]);
            System.out.println(S.length()); 
            int Number = Integer.parseInt(A);
        } catch (ArithmeticException E) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Array Index out of Bounds ");
        } catch (NullPointerException E) {
            System.out.println("Null pointer Exception");
        } catch (NumberFormatException E) {
            System.out.println("Number Format Exception");
        }
    }
}
