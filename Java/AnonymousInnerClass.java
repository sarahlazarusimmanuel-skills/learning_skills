//class One {
//    public  void show()
//    {
//        System.out.println("in Show ");
//    }
//}
//Combination of Abstract and InnercLASS
abstract class One{
    public abstract void show(); //I fYou want to implement the abstract or interface only once we can do this combination
    public abstract void config();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        One obj = new One()
        {
            public void show()
            {
                System.out.println("In new Show ");
            }
            public void config()
            {
                System.out.println("In config show ");
            }
        };
        obj.show();
        // priority will be given to the show method of main method
        obj.config();
    }
}