class Human{
    private int age ;
    private String Name;

    //A construcor never returns anything
    //A constructor has the same name as the class Name
    //A constructor will be called every time you create a new  object
    public Human()//DEFAULT Constructor
    {
        this.age = 124;
        this.Name = "John";
        System.out.println("In Default Constructor " );
    }
    public  Human(int age , String n)
    {
        this.age = 13;
        this.Name = "Sarah";
        System.out.println("In Paramaterized Constructor ");
    }
    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.Name;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public void setAge(int a)
    {
        this.age= a;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(12, "Sarah");
//        obj.age = 11;
//        obj.Name = "Sarah";
//        System.out.println("Name : " + obj.getName() + " Age is : " + obj.getAge() );
//        obj.setName("Sarah");
//        obj.setAge(12);
        System.out.println("Name : " + obj.getName() + " Age is : " + obj.getAge() );
        System.out.println("Name : " + obj1.getName() + " Age is : " + obj1.getAge() );
    }
}