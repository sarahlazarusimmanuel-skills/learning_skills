//Two Parents one child called Multiple Inheritance it is possible in C++ Is it possible in java too?
//No we cant but why ?
//Because imagine if both parents have method y and when we call obj.y() it will createa confusion that from whom should I inherit
//This problem is called Ambiguity problem
//class A{
//
//}
//class B{
//
//}
//class C extends A , B
//{
//
//}
public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        System.out.println(obj.add(7,3));
        System.out.println(obj.multiply(7,3));
        System.out.println(obj.power(10,2));
    }
}

//But there might be a way of doing it by using interfaces
