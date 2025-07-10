//To understand Exceptions we need to learn about Error Types
//Compile Time - spellings , syntactical errors
//Runtime Time - because of some reason your code stops running , execution stops
                //opening a file sometimes file is not found //abruptly stopd
                // we need to handle these exceptions
//Logical Time - we didnt get expected output that means problem is in the logic

//Exceptions are runtime errors ->divide by zero
public class Exceptions {
    public static void main(String[] args) {
        //statements can be normal statement or critical statement
        int i =2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try
        {
            System.out.println(str.length());
            j=18/i;// Whenever we get the exception over here it directly jump to
            // the exception ignoring other statements in try block
            System.out.println(nums[5]);
        }
//        catch (Exception e) //Java here throws an exception ou need to catch it and it throws an object
//        {// this block will be executed only at the time of exception itherwise it will get skipped
//            System.out.println("Something went wrong " + e);
//        }
        catch(ArithmeticException e )
        {
            System.out.println("Cannot divide by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e )
        {
            System.out.println("You are accessing the element out of the array ");
        } catch (Exception e) {//Parent class of Exception we can use this because we dont know other that
            // this two some exception or error might happen so we need to hanldle it
            System.out.println("Something went wrong " + e);
        }// this block keep it at the end
        System.out.println(j);
        System.out.println("Bye");
    }

}