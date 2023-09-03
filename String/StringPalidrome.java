package String;

public class StringPalidrome {
    public static void main(String[] args) {
        String s1 = "121";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Palidrome");
        } else {
            System.out.println("Not Palidrome");
        }

    }

}