//Example of generic concept
import java.util.*;
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
