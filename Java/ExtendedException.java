
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ExtendedException  {
    public static void main(String[] args) throws Exception{
//        int i = 0 ;
//        int j =0 ;
        int num =0;
        //BufferedReader br = null;
//        try
//        {
////            j =18/i;
////            System.out.println("Bye");
//            InputStreamReader in = new InputStreamReader(System.in);
//            br = new BufferedReader(in);
//            num = Integer.parseInt(br.readLine());
//        }
          try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in)))
          {
              //automatically close the resource
              num = Integer.parseInt(br.readLine());
          }
//        catch (Exception e){
//            System.out.println("Something went wrong ");
//
//        }
//        finally {//try with resources
//            System.out.println("Bye");//Irrespective of the exception it will print
//            // whenever you want to close the resource use finally
//            br.close(); //close the resource
//        }
    }
}