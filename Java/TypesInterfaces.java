//Types
//Normal    Functional Interface (SAM) Marker Interface
//Till now we are aware that in interface we can only declare methods
//After java 8 we also get an option to define the methods in the interface
//NOrmal --> two or more methods
//FunctionalInterface SAM -> Single Abstract Method
//Here we have only one abstract method

//Marker Interface has no methods // usage to update something to the compiler //during serialization -> you are storing an object into the hardware
//like we save some file
//Deserialization to load the values into the object instead of default values //by default every object is not allowed to that
//you have to give permission through MarkerInterface
@FunctionalInterface
interface D{
    void show();
}
//class D implements C{
//
//    public void show() {
//        System.out.println("In SHow");
//    }
//}
public class TypesInterfaces {
    //var num = 10; //Instance variables // 'var' is not allowed here

    public static void main(String[] args) {
        D obj = new D() {//Anonymous
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();
        //LVTI ->Local Variable TypeInference
        int a = 9;
        var b = 8;// is also in integer datatype //type will be assigned by compiler
        int c;
        var d = 10;                  // cannot infer type for local variable d

        // cannot use 'var' on variable without initializer
        //
        String var ="Sarah";
        //dont make your class var it will not work
        //int nums[] = new int[10];
        var nums = new int[10]; //no need of square brackets
        var obj = new Alien();
    }
}
//We can use Lambda expressions only with functional Interface