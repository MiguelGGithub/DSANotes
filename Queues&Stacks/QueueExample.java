import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // What is a queue?
        // - FIFO data structures (First in, First Out)
        // - A collection designed for holding elements prior to processing
        // - Linear data structure

        // What are some queue methods?
        // - Adding = enqueue, offer()
        // - Removing = dequeue, poll()
        // - Inspecting = peek(), element()

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Jill");
        queue.offer("John");

        System.out.println(queue.isEmpty()); //false
        System.out.println(queue.size()); //4
        System.out.println(queue.contains("John")); //True 
        


        //System.out.println(queue.peek());

        //queue.poll(); //Removes karen
        //queue.poll(); //Removes chad

        System.out.println(queue);
    }
}
