class One {
    public  void show()
    {
        System.out.println("in Show ");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        One obj = new One()
        {
            public void show()
            {
                System.out.println("In new Show ");
            }
        };
        obj.show(); // priority will be given to the show method of main method
    }
}