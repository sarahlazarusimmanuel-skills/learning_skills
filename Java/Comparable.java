import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
  class Student implements java.lang.Comparable<Student> {
      int age;
      String name;
      public Student(int age , String name ){
                this.age= age;
                this.name= name;
      }
      @Override
      public String toString() {
          return "Student{" +
                  "age=" + age +
                  ", name='" + name + '\'' +
                  '}';
      }
      
      public int compareTo(Student that) {
          if(this.age > that.age)
              return 1;
          else
              return -1;
      
      }
  }
public class Comparable {
    public static void main(String[] args) {
//        Comparator com = new Comparator<Integer>() {
//            //  Here you need to use Integer compulsorily
//              public  int compare (Integer i , Integer j ){
//                      if(i%10 > j%10)    //Dont use int in method here use here wrapper class thats it Integer
//                          return 1;
//                      else
//                          return -1;
//              }
//        };//its an interface   using which you can specify your own logic for sorting
//        List<Integer> nums = new ArrayList<>();
//        nums.add(4) ;
//        nums.add(7) ;
//        nums.add(8) ;
//        nums.add(7) ;
//        System.out.println(nums);
//        Collections.sort(nums,com);
//        System.out.println(nums);
        //but what if I want to sort the digits based on their last digit
        Comparator com = new Comparator<Student>() {
            //  Here you need to use Integer compulsorily
            public  int compare (Student i , Student j ){
                if(i.age%10 > j.age%10)    //Dont use int in method here use here wrapper class thats it Integer
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> s = new ArrayList<>();
         s.add(new Student(23,"Sarah"));
         s.add(new Student(19,"Sharon"));
         s.add(new Student(21,"John"))   ;
        Collections.sort(s);  //for comparable
        Collections.sort(s,com);  //for comparator 
         System.out.println(s);
    }
}