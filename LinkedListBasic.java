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
        ll.set(1, "G");

        System.out.println(ll);

        // ll.remove("B");
        // ll.remove(3);
        // ll.removeFirst();
        // ll.removeLast();
        for (String str : ll) {
            System.out.print(str + " ");
        }

        Object[] arr = ll.toArray();
        for(Object element: arr){
            System.out.print(element + " ");
        }

        System.out.println("Size: " + ll.size());
    }

}