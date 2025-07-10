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
interface C{
    void show();
}
//class D implements C{
//
//    public void show() {
//        System.out.println("In SHow");
//    }
//}
public class TypesInterfaces {
    public static void main(String[] args) {
        C obj = new C() {//Anonymous
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}
//We can use Lambda expressions only with functional Interface
