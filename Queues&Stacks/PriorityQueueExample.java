import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
        Queue<String> queue2 = new PriorityQueue<String>();

        //Imagine these are GPAs and based off the scores, it determines how much tutoring they get
        // Ex. the lowest score gets 5 hrs of tutoring and the highest gets 0 hrs.

        //For reverseOrder(), imagine the highest score gets a medal, 
        // and the lowest score gets a punishment.

        queue.offer(3.0);
        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.5);


        // Sorted alphabetically
        queue2.offer("Karen");
        queue2.offer("Chad");
        queue2.offer("Jill");
        queue2.offer("John");


        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        while(!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}
