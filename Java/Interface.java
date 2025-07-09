//class - class -> extends
//class - interface ->implements
//interfac - interface -> extends
interface A{
    //interface is not a class
    //by default every method in the
    // interface is public abstract we dont need to mention it
    int age = 12;//variables in interface are
    // by default static and final
    //Why --> first we dont instantiate here because its not a class
    //Interface dont have memory in the heap
    String area = "Mumbai";
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X{

}//class can extend another class and
// whenever we want to interface to interface we use extends
class B implements  A,Y{//compulary to define the methods
    // if you fail to define the methods then it will
    // by  default become abstract class
    public void show()
    {
        System.out.println("In Show");
    }

    public void config()
    {
        System.out.println("In Config");
    }

    public void run()
    {
        System.out.println("Running");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj; // we cant do obj = new A() because A is not a class
        obj = new B();
        obj.show();
        obj.config();
        //obj.run();// A doesnt know who is run so
        X obj1= new B();
        obj1.run();

        //A.age= 13;
        System.out.println(A.age);

    }
}
//Need of interface
//We can do multiple inheritance through interface
//Promoting loosly coupled
//Generalizing the things
//We can have one class implementating multiple interfaces
