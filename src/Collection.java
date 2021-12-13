/*Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList
        , Vector, LinkedList
        , PriorityQueue
        , HashSet, LinkedHashSet, TreeSet).
List interface
List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

//Array list.
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Anshika");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
//LinkedList
//LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
// It can store the duplicate elements.
import java.util.*;
public class Collection{
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("Ravi");
        l1.add("anshika");
        l1.add("Ravi");
        l1.add("akansha");
        Iterator<String> itr=l1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
//vector
import java.util.*;
public class Collection{
    public static void main(String[] args) {
        Vector<String>v=new Vector<String>();
        v.add("anshika");
        v.add("amit");
        v.add("Hritik");
        v.add("Priyanshi");
        v.add("akansha");
        Iterator<String>itr=v.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());


    }
}
//stack
import java.util.*;
public class Collection{
    public static void main(String[] args) {
        Stack<String>s1=new Stack<String>();
        s1.push("anshika");
        s1.push("amit");
        s1.push("Hritik");
        s1.push("Priyanshi");
        s1.push("akansha");
        Iterator<String>itr=s1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}*/
//set interface
//Hash set- It contains unique items.
import java.util.*;
public class Collection{
    public static void main(String[] args) {
        HashSet<String> s1=new HashSet<String>();
        s1.add("anshika");
        s1.add("amit");
        s1.add("Hritik");
        s1.add("Priyanshi");
        s1.add("anshika");
        Iterator<String>itr=s1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}