class A{
    public void show()
    {
        System.out.println("In A show ");
    }
}
class B extends  A{
    public void show()
    {
        System.out.println("In B show ");
    }

}
class C extends A{
    public void show()
    {
        System.out.println("In c show ");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();//Here type of obj is A but the iimplementatin hereis B
        obj.show();
        obj = new B();
        obj.show();

        obj= new C();
        obj.show();//here different object will have different behaviour --> Runtime Polymorphism
    //All this above concept is called Dynamic Method Dispatch
        //only inheritance
    }
}