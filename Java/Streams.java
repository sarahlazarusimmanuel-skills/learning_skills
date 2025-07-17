import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {
    public static  void main(String[] args) {
        //List<Integer> nums= new ArrayList<>();
        //nums.add(4);
        //nums.add()
        //Instead of doing nums.add you can use Arrays.asList();
        List<Integer> nums = Arrays.asList(4, 5, 6, 1, 2);
//        Stream<Integer> s1 =nums.stream();   //if you make any changes to s1 nums
//        // will not get affected
//        //s1.forEach(n-> System.out.println(n));
//        //s1.forEach(n-> System.out.println(n));     // stream has already been operated upon or closed
//        Stream<Integer> s2 =s1.filter(n->n%2==0);
//        //s2.forEach(n-> System.out.println(n));
//        Stream<Integer> s3 = s2.map(n->n*2);
//        int result = s3.reduce(0,(c,e)->c+e);
//        System.out.println(result);
        //s3.forEach(n-> System.out.println(n));
        //Only thing about stream is once you use it you cant reuse it  just like the flow of water 
//        Consumer<Integer> comp = new Consumer<Integer>(){
//            public void accept(Integer n )
//            {
//                System.out.println(n);
//            }
//        } ;
        //Use Lambda expression here
//        Consumer<Integer> comp =  n->System.out.println(n);

        //We dont need to create reference of Consumer
        //nums.forEach(n->System.out.println(n));


         //foreach it takes an object of Consumer and Consumer is a untional interface
//        for(int i =0 ;i<nums.size();i++)
//        {
//            System.out.println(nums.get(i));
//        } //Here I am specifically mentioning the index
//        for(int n :nums) {
//            System.out.println(n);
//        } //Here it says that the array itself will give the value and that value goes into n
        //to print
//        int sum = 0 ;
//        for(int n :nums)
//        {
//            if(n%2 ==0)
//            {
//                n*=2;
//                sum+=n;
//            }
//        }
//        System.out.println(sum);
        //System.out.println(nums);

        //foreach method will give you one value at a time
        //nums.forEach(n-> System.out.println(n));  //But how this works ?  -> Above aprt for onsumer
//        Predicate<Integer> p = new Predicate<Integer>() {
//
//            public boolean test(Integer t) {
////                 if(t%2==0)
////                     return true;
////                 else
////                     return false;
//                return t%2==0;
//            }
//        };

        //How map works
        //teo parameters one for accepting another for returning
//   Function<Integer,Integer> f = new Function<Integer, Integer>() {
//
//       public Integer apply(Integer n) {
//           return n*2;
//       }
//   }  ;
    //Reduce
        //Every time you will add two values 
       int result = nums.stream()
               .filter(n->n%2==0)
               //.map(n->n*2)
               //.map(f)
               .reduce(0,(c,e)->c+e);
        System.out.println(result);


        //Lets first talk about filter here ,It needs a
        // Predicate an interface  (boolean valued function  )
        // functional method test method

        Stream<Integer> sortedValues = nums.stream()
                .filter(n->n%2==0)
                .sorted();
        //System.out.println(sortedValues);
        sortedValues.forEach(n-> System.out.println(n));

        //parallelStream
        Stream<Integer> sortedValuesOne = nums.parallelStream()
                .filter(n->n%2==0)   ;
        //to make your work easier through threads
        sortedValuesOne.forEach(n-> System.out.println(n));


    }
}