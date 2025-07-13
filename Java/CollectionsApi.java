//Three different things in collections
//Collection API concept
//Collections class
//Collection interface
//We are taking about Collection interface
//Collection belongs to java.util package
// Any group of individual objects that are represented as a single unit is known as a Java Collection of Objects. In Java, a separate framework named the "Collection Framework" has been defined in JDK 1.2 which holds all the Java Collection Classes and Interface in it.

//In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.
import java.util.*;

public class CollectionsApi {
    public static void main(String[] args) {
//                Collection nums = new ArrayList();
//                nums.add(1);   //these numbers 1 , 3 5 6 are objects not numbers  // Collection class works eith object
//                nums.add(3);
//                nums.add(5);
//                nums.add(6);
//        System.out.println(nums);
//                for (Collection n:nums)
//                {
//                    System.out.println(nums);
//                }
//        Collection interface
//        List  -> ArrayList  LinkedList
//        Queue         Deque
//        Set   HashSet LinkedHashedSet

//            List<Integer> nums = new ArrayList<>();
//        nums.add(6);
//        nums.add(3);
//        nums.add(4);     //Allows duplicate value
//        nums.add(6);
////        System.out.println(nums.get(0));
////        System.out.println(nums.indexOf(6));
//        for(Object n:nums){
//            System.out.println(n);
//        }

//        Set<Integer>nm = new HashSet<>();
//        nm.add(6);
//        nm.add(3);
//        nm.add(4);       //Unique values, no duplicate , no indexvalues,introduced in  1.2 , collection framework
//        nm.add(6);        //not prints in sorted format
//
//        for(Object n:nm){
//            System.out.println(n);
//        }

//        Collection<Integer> obj= new TreeSet<>();        //You can also Use Set or collection here
//        obj.add(6) ;
//        obj.add(7);     // Set extends AbstractSet and it also extends SortedSet
//        obj.add(2);
//        obj.add(3);
//         Iterator<Integer> values = obj.iterator();
//           while(values.hasNext())//do we have a next element
//           {
//               values.next();   //only one element
//           }
//        for(int n :obj){
//            System.out.println(n);
//        }


        //Map itself is a Interface
         // Why we need Map ->  in LIst we need to work with index , so instead of index I want another name like I can relate with something
        //instead of index we can name it and we can use for this is key and value pair
        //key and value in one datastructure
        Map <String,Integer>students = new HashMap<>();
           students.put("Navin",56);
            students.put("Sarah",68);                   //not following a sequence while printing
            students.put("John",23);           //in put if you aleady have the key just udate the values thats why ut not add
            students.put("Joy",88);
            students.put("Sharon",76);
        students.put("Sarah",99);
        System.out.println(students);  // It replaced the values . key should be unique //So we can say that key are Set and Values are List
        System.out.println(students.get("Sarah"));

        System.out.println(students.keySet());    //Only keys
           for(String key : students.keySet()){
               System.out.println(key + " : " + students.get(key ));
           }
          //HashTable also works the same but whats the difference only it is synchronized
        //If threads concept  is involved use HashTable
    }
}    //Collection extends Iterable