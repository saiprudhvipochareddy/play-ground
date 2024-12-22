package javaconcepts.collections.PirorityQueue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // as queue is interface we can't instantiate the object, but we can use it as reference
        Queue<Integer> queueWithPriority = new PriorityQueue<>();
        Queue<Integer> queueWithArrayDeque = new ArrayDeque<>();

        //System.out.println(queueWithPriority.element()); // throws exception
        System.out.println("empty queue: " + queueWithPriority.peek()); // returns null

        queue.add(1);
        queue.offer(2);

        System.out.println(queue);

        Queue<String> queueSt = new ArrayBlockingQueue<>(2);

        // add vs offer

        // Add elements to the queue
        System.out.println(queueSt.add("Apple")); // true
        System.out.println(queueSt.add("Banana")); // true

        // This will throw IllegalStateException because the queue is full
        //queueSt.add("Cherry"); // Uncommenting this line will throw exception

        // Using offer() will not throw an exception; it will return false if the queue is full
        System.out.println(queueSt.offer("Cherry"));


    }
}
