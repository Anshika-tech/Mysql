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
}*/
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