// I have learned a new thing in java is stactic block
// I have previously used static block and static method
//lets see about static block
class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name="Phone";
        //this block will be called only once
        System.out.println("in static block");
    }
    public Mobile()
    {
        brand ="";
        price=200;
       // name="Phone";
        System.out.println("In constructor");
    }
    public void show ()
    {

    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1000000;
        obj.name = "SmartPhonegit ";


//first class loads and then objects fet instantiated
//class will load only once
//In JVM we have a special area called class loader
//since class loading happens first thats why static block gets executed first

//how to load the class without calling th constructor
        Class.forName("Mobile");//which loads your class
        //used in JDBC
    }
}