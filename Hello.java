// Create a blueprint
class Programmer {
    private String name;
    private int age;

    public Programmer()
    {
        name = "John";
        age = 13;
    }
    

    
}
public class Hello {
    public static void main(String[] args){
        Programmer p = new Programmer();
        // p.setName("AROMA");
        // p.setAge(10);
        System.out.println("Name==> " + p.getName());
        System.out.println("Age==> " + p.getAge());
    }
}