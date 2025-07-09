//Enummeration -> named constants which we use
enum Status{
    RUNNING,
    COMPLETED,
    FAILED;
//Status is a class and inside it are called objects
}
public class Enum {
    public static void main(String[] args) {
       // int i = 5 ;
        Status s = Status.RUNNING;
        System.out.println(s.ordinal());

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
    }
}