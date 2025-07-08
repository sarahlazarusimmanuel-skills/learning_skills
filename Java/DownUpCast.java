class A{

    public void show1()

    {

        System.out.println("In A show");

    }

}

class B extends A{

    public void show()

    {

        System.out.println("In B show");

    }

}

public class DownUpCast {

    public static void main(String[] args) {

        A obj = (A)new B();  // OBJ is of B but refer to A // this is called Upcasting

        // this works implicitly behind the scenes so need to mention it

        obj.show1();

        // obj.show();//Here we will get an error because we have the obj of B but the reference is of A so in this A doesnot know what is show()

        //for example A Parent doesnot know his/her child



        //B obj1 = new B();// here we are creating a new object

        //but what if I dont want to create anew object instead of this I will reuse the object

        B obj1= (B)obj;// Here we will get an error because the object reference is of class A  similar to double getting stored in int so we need

        //to downcast it

        obj1.show();





    }

}