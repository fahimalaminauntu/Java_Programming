public class Cat extends Animal implements pet {
    private String name;

    public Cat() {
        System.out.println();
    }

    public Cat(String name) {
        this.name = name;

    }

    public void eat() {
        System.out.println("Cat is Eating ");

    }

    public void play() {
        System.out.println("Cat is playing");
    }

    public void getName() {
        System.out.println("Sami");

    }

    public void setName() {
        this.name = name;

    }
}