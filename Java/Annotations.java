class First
{
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("In First show");
    }
}
class Second extends  First{
    @Override // You can make your own annotations
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("In Second show");
    }
}
public class Annotations {
    public static void main(String[] args) {
        //metadata //sometimes you want to interact with the compiler to tell some extra information
            Second obj = new Second();
            obj.showTheDataWhichBelongToThisClass();
    }
}