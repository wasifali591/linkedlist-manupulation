import java.util.*;

public class LinkedListBasic {
    public static void main(String[] args) {

        // create linked list
        LinkedList<String> ll = new LinkedList<String>();

        // add element
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add("E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }

}