//final is a keyword can be used in variable , method ,class
//final class Calc{
class Calc{
    public final void show()
    {
        System.out.println("BY Sarah  Calc Show ");
    }
    public void add (int a , int b )
    {
        System.out.println(a+b);
    }

}
class AdvCalci extends Calc // wont be able to inherit it because the parent class is final
{
    public  void show()// we cannot override final method
    {
        System.out.println("By John Advcalc show ");
    }

}
public class Final {
    public static void main(String[] args) {
        //final int num = 8 ; // Constant variable once you assign final to a variable it cant be changes
        //num = 9 ;
        //System.out.println(num);
        Calc obj = new Calc();
        obj.add(2 , 3);
        obj.show();
    }
}