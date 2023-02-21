public class Person{
    private String Name;
    private int Id;
    public Person(String Name,int Id){
        this.Name=Name;
        this.Id=Id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public static void main(String[] args){
    Person obj=new Person("Auntu",4672);
    obj.setName("Auntu");
    obj.setId(4672);
    System.out.println(obj.getName());
    System.out.println(obj.getId());
    }
}
