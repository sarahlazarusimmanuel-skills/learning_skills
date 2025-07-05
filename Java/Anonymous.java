class A{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        new A().show();//anonymous object
        new A().show();// this a new object not the previous one you cant use it again
    }
}