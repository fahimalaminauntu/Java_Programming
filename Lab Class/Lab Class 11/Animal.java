public abstract class Animal {
    protected int legs;

    public void walk(int legs) {

    }

    public Animal() {

    }

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

}