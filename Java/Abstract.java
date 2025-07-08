abstract class Car{// If you are extending a abstract ckass you need to define it override the method
    public abstract void drive();//abstract method belongs to Abstract class
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Play Music");
    }

}
abstract class WagonR extends Car{
    public void drive()
    {
        System.out.println("Driving ");
    }



}
class UpdatedWagonR extends WagonR{ //concrete class
    public void fly() {
        System.out.println("Flying");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();//You cannot create an object of the abstracg class but you can create refercnec of Car
        obj.drive();
        obj.playMusic();
        obj.fly();

        //Is it compulsory to have abstact method in the abstract class  --
        // It can have normal methods adn abstract methods as well
    }
}