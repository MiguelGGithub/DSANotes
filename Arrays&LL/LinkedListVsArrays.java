import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListVsArrays {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 100000; i++) {
            linkedlist.add(i);
            arraylist.add(i);
        }

        //**************LinkedList****************
        startTime = System.nanoTime();

        //linkedlist.get(0); Slower than ArrayList
        //linkedlist.get(50000); Slower than ArrayList
        //linkedlist.get(99999); //Slower than ArrayList
        //linkedlist.remove(0); //Faster than ArrayList
        //linkedlist.remove(50000); //Slower than ArrayList
        linkedlist.remove(99999); //Near same as ArrayList

        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: \t" + elapsedTime+ " ns");

        //**************ArrayList****************
        startTime = System.nanoTime();

        //arraylist.get(0); Faster than LinkedList
        //arraylist.get(50000); Faster than LinkedList
        //arraylist.get(99999); //Faster than LinkedList
        //arraylist.remove(0); //Slower than LinkedList
        //arraylist.remove(50000); //Faster than LinkedList
        arraylist.remove(99999); // Near same as LinkedList

        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: \t" + elapsedTime+ " ns");


    }
}
