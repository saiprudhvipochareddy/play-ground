package javaconcepts.collections.PirorityQueue;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityMaxQueue {
    public static void main(String[] args) {
        Queue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);
        maxPq.add(1);
        maxPq.add(2);
        maxPq.add(8);
        maxPq.add(10);
        maxPq.add(5);

        maxPq.forEach(System.out::println);

        while(!maxPq.isEmpty()) {
            System.out.println("\n");
            System.out.print("removed: "+ maxPq.poll());
        }
    }
}
