//Enummeration -> named constants which we use
enum Status{
    RUNNING,
    COMPLETED,
    FAILED;
//Status is a class and inside it are called objects
}
public class Enum {
    public static void main(String[] args) {
        int i = 5 ;
        Status s = Status.RUNNING;
        System.out.println(s.ordinal());
        Status[] a = Status.values();
        for(Status n : a)
            System.out.println(n + ":" + n.ordinal());
    }
}