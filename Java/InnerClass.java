//InnerClass  a class inside a class
//Tf you have a class where the class is totally
// dependent on class A there is no other class it neede
class A{
    int age;
    public void show ()
    {
        System.out.println("In Show");
    }
    static class B{ // static can me used only ofr the inner class
        public void config()
        {
            System.out.println("In Config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

       // A.B obj1= new A.B();//B belongs to A
        //to access B first create obj of A first
//        A.B obj1= obj.new B();
//        obj1.config();

        // If my class B is static then only the following wll work
        A.B obj1 = new A.B();
        obj1.config();
    }
}