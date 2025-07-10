@FunctionalInterface
interface C{
    //void show();
    void show(int i);
}
public class Lambda {
    public static void main(String[] args) {
//        C obj = new C() {//Anonymous
//            public void show() {
//                System.out.println("In Show");
//            }
//        };
//        obj.show();// Lambda says that we simplyfy the anonymus ina class only for lambda expresion
//            C obj = () -> //-> is Lamba here and compiler will understand it
//            {
//                System.out.println("In Show");
//            }
//            ;// Syntactically the code is reduced
//            C obj =()->System.out.println("In Show");
//            obj.show();
//        C obj = new C() {//Anonymous
//            public void show(int i ) {
//                System.out.println("In Show " + " i : " +  i);
//            }
//        };
//        C obj = (int i)->System.out.println("In Show updated" + " i : " +  i);
        //C obj = (i)->System.out.println("In Show updated" + " i : " +  i);
        C obj = i->System.out.println("In Show updated" + " i : " +  i); //if you have only one variable
        obj.show(5);

    }
}