import java.util.LinkedList;
public class LinkedListsEx {
    public static void main(String[] args) {
      
        LinkedList<String> linkedlist = new LinkedList<String>();

        //Linked lists as stacks
        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("F");
        // linkedlist.pop(); // remove the last added element (F)


        //Linked lists as queues
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        //linkedlist.poll(); // remove the first element (A)

        //Adding an element 
        linkedlist.add(4, "E"); // add E at index 4
        linkedlist.remove("E"); // remove E
        System.out.println(linkedlist.indexOf("F")); // get the index of F (4)
        System.out.println(linkedlist.peekFirst()); // get the first element (A)
        System.out.println(linkedlist.peekLast()); // get the last element (F)
        linkedlist.addFirst("0"); // add 0 at the beginning
        linkedlist.addLast("G"); // add G at the end

        System.out.println(linkedlist);
    }
}