public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Faridpur","Jhiltuli","Bangladesh");
        Address address2=new Address("Dhaka","Saver","Bangladesh");

        Emp e=new Emp(4672,"Auntu",address1);
        Emp e2=new Emp(3213,"Al Amin",address2);

        e.display();
        e2.display();

    }
}
