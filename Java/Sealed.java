sealed class Q extends Thread implements Cloneable permits F,G{

}
non-sealed class F extends Q{ //it should be final /sealed/non-sealed
    
}
final class G extends Q {

}
class J extends F{    //basically the subclasses of a sealed class can be sealed final or non-sealed

}
sealed  interface N permits L{

}
non-sealed interface L extends N{      //here we dont have fianl only two options seale and non-sealed

}
public class Sealed{
    public static void main(String[] args) {
           //Sealed classes  means not every classes
        // can be inherited combination of Abstract and Final class
        //Through this sealed class we can mention which subclasses or classes cna inherit
        //SEALED KEYWORD
        System.out.println("Hi using sealed classes feature of Java 17");
        
    }
}