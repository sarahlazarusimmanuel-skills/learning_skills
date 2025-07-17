import java.util.Objects;
          //Instead of creating aclass with this much methods we can write it though record classes
//below class only contains data we can simplify it

//class Alien {
//    private final int id ;
//    private final String name;
//    public Alien(final int id, final String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    @Override
//    public boolean equals(final Object o) {
//        if (null == o || this.getClass() != o.getClass()) return false;
//        final Alien alien = (Alien) o;
//        return this.id == alien.id && Objects.equals(this.name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.id, this.name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//You can create methods , static methds as well 
   //if you carefully see here we have a constructor
//we can even change the behavior of a constructor   // We dont have a default constructor by default
record  Alien (int id , String name) implements Cloneable{ //All the values in Alien here is bydefault private and final //You cant change the data
    //Record is a class and this class cannot extend anyother class   but you can implement interface
//    public Alien(){
//        this(0," ");
//    }; //Non-canonical record constructor must delegate to another constructor
//    public Alien(int id , String name ){ //Canonical Constructor
//        if(id ==0)
//            throw new IllegalArgumentException("Id cannot be zero");
//
//          this.id = id;
//          this.name= name ;
//    }
    //Lets make some compact canonical constructor
    static int  n = 10 ; //Statcic instance variables are allowed here 
    //int age ; //You cant declare instance variabels here do that abve in ()
    public Alien
    {
        if(id == 0)
            throw new IllegalArgumentException("Id cannot be zero");
    }
    
} //it simply means it have these instance variables i.e components and you can it as state variables
public class Record{
    public static void main(String[] args) {
        Alien a1= new Alien(1,"Sarah");
        //Alien a2 = new Alien(2,"Navin");
        Alien a2 = new Alien(0,"Sarah");
        //Alien a3 = new Alien();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.equals(a2));  //   they are two different objects  and two different memory location
        System.out.println(a1.name());    //override is defined in the record     to fetch instead of get and set use the variable()
    }
}