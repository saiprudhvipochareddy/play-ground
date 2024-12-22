package javaconcepts.collections.PirorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMinQueue { // internally follows heap concept
    public static void main(String[] args) {
        Queue<Integer> minPq = new PriorityQueue<>();
        minPq.add(1);
        minPq.add(2);
        minPq.add(8);
        minPq.add(10);
        minPq.add(5);

        minPq.forEach(System.out::println);

        while(!minPq.isEmpty()) {
            System.out.println("\n");
            System.out.print("removed: "+ minPq.poll());
        }
    }
}
