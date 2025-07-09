//Enummeration -> named constants which we use
enum Status{
    RUNNING,
    COMPLETED,
    FAILED;
//Status is a class and inside it are called objects
}
enum Laptop{
    MacBook(2000),XPS(2200),Surface,ThinkPad(1800);
    private int price;
    private Laptop()
    {
        this.price = 500;
    }
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {// here we are using private constuctor because we are creating the object (i.e Macbook etc)
//in the same class
       this.price = price;
    }
}
public class Enummeration {
    public static void main(String[] args) {
       // int i = 5 ;
        Status s = Status.RUNNING;
        System.out.println(s.ordinal());
        System.out.println(s.getClass().getSuperclass());

        switch(s)
        {
            case RUNNING :
                System.out.println("ALL GOOD");
                break;
            case FAILED:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Done");
                break;

        }
        if(s == Status.RUNNING)
        {
            System.out.println("ALL GOOD");
        } else if (s == Status.COMPLETED) {
            System.out.println("Done");
        } else if (s == Status.FAILED) {
            System.out.println("Try Again");
        }
        else {
            System.out.println("Finished");
        }
        /*Status[] a = Status.values();
        for(Status n : a)
            System.out.println(n + ":" + n.ordinal());*/
        Laptop lp = Laptop.MacBook;
        System.out.println(lp.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}

//Enum is a class but we cant extend it
//You can create constructor and also define variables inside enum

//Bydefault enum in java extends a Enum class