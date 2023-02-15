public class LABclass {
    int x = 500000000;

    void sum() {
        x = x + 5;
        System.out.println(x);
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        LABclass myObj = new LABclass();
        System.out.println(myObj.x);
        myObj.sum();
        // obj.sum();
        myObj.display();
    }
}
