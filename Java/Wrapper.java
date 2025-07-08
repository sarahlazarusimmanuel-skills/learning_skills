public class Wrapper {

    public static void main(String[] args) {

        int num = 7;

        //Integer num1 =  8;

        //Integer num1 = new Integer(num);//primitive value getting stored into the class object  --> boxing

        Integer num1 = num;//autoboxing it will automatically get converted to object automatically

        //int num2 = num1.intValue(); //unboxing you are getting the value from object type to primitive type

        int num2 = num1 ; //autounboxing

        System.out.println(num1);



        String str = "12";

        int num3 = Integer.parseInt(str); // String to Int

        System.out.println(num3* 2);

    }



    // primitive to Object autoboxing

    // primitive from object autounboxing

}

