// To perform Encapsulation
//make your instance variables private
// and use getter and setter methods to give access to the outside world

class Human{
    private int age ;
    private String Name;

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
public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
//        obj.Name = "Sarah";
        System.out.println("Name : " + obj.getName() + " Age is : " + obj.getAge() );
        obj.setName("Sarah");
        obj.setAge(12);
        System.out.println("Name : " + obj.getName() + " Age is : " + obj.getAge() );
    }
}