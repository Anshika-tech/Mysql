//Example of generic concept
/*import java.util.*;
public class Generics {
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<String>();
        l1.add("rahul");
        l1.add("jai");
        l1.add("Anshika");
        l1.add("komal");
        //list.add(32);//compile-time error.
        String s=l1.get(2);//type casting is not required.
        System.out.println("element is :"+s);
        Iterator<String>itr=l1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
//Generic class
import java.util.*;
class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class Generics{
    public static void main(String[] args) {
        MyGen<Integer>m=new MyGen<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        m.add(sc.nextInt());
        System.out.println(m.get());
    }
}
//Generic method
public class Generics{
    public static <E> void printArray(E[] elements){
        for(E element :elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] a1={10,20,30,40,50};
        Character[] ch={'j','a','v','a'};
        System.out.println("Printing Integer Array");
        printArray(a1);
        System.out.println("Printing Character Array");
        printArray(ch);
    }
}*/
//Wildcard in java Generics
/*import java.util.*;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
public class Generics{
    public static void drawShapes(List<? extends Shape>l1){
        for(Shape s:l1){
            s.draw();
        }
    }
    public static void main(String[] args) {
      List<Rectangle>l2=new ArrayList<Rectangle>();
      l2.add(new Rectangle());
      List<Circle>l3=new ArrayList<Circle>();
      l3.add(new Circle());
      drawShapes(l2);
      drawShapes(l3);
    }
}
 */
//Upper Bound Wildcard
//The purpose of upper bounded wildcards is to decrease the restrictions on a variable.
//It restricts the unknown type to be a specific type or a subtype of that type.
//Example of Upper Bound Wildcards.
/*import java.util.*;
public class Generics{
    private static Double add(ArrayList<? extends Number>num){
        double sum=0.0;
        for(Number n:num){
            sum=sum+n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
     ArrayList<Integer>l1=new ArrayList<Integer>();
     l1.add(10);
     l1.add(20);
        System.out.println("Displaying sum= "+add(l1));
        ArrayList<Double>l2=new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("Displaying sum= "+add(l2));
    }
}*/