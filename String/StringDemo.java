package String;

public class StringDemo {
    // Replace
    public static void main(String[] args) {
        String s1 = "Object- Oriented- Programming";
        System.out.println(s1);
        String s2 = s1.replace('i', 'j');
        System.out.println("Result of replace =" + s2);

        // Split
        String[] s3 = s1.split("-");
        for (String a : s3) {
            System.out.println(a);
        }

    }

}
