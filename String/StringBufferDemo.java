package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Auntu ");
        System.out.println(sb);
        sb.append("Fahim Al-Amin ");
        sb.append("22");
        System.out.println(sb);
        // Reverse
        sb.reverse();
        System.out.println(sb);
        // Delete
        sb.delete(0, 5);
        System.out.println();
    }

}
