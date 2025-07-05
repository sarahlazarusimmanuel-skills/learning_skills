//Every constructor in java has a method and that method is called super even if you dont mention it and thats while displaying A 's constris called first
//Irrespective of which class it is each constructo will have a super method its hidden until mentioned
//bUt in our case who is the super of A
//VERY VERY IMPORTANT THING OVER HERE IS
//Every class in Java extends the object class even if you are not extending it

// I want only one obkect and bith the coonstructors of B need to be called
// output should be in A , In B ans In B int
//Use this method this()   It will execute the constructor of the same class

class A extends Object {
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B()
    {
        //super();
        //super(5);
        //this();
        System.out.println("In B");
    }
    public B( int n )
    {
        //super();//this will call the default constructor of super in our case A
        //super(n);//now this will call the parameterized constructor of A
        this();
        System.out.println("In B int ");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        //B obj = new B(5); // both constructors will be called
        B obj = new B(5);



    }
}