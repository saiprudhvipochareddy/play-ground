package javaconcepts.multithreading.producerconsumerproblem.assignment;

import java.util.LinkedList;

public class SharedResourceQueueMain {

  public static void main(String[] args) {
    SharedResourceQueueImpl sharedResourceQueue = new SharedResourceQueueImpl(new LinkedList<>(), 3);

    Thread producerThread = new Thread(() -> {
      System.out.println("Invoked producer with thread: " + Thread.currentThread().getName());
      for (int i = 0; i <= 10; i++) {
        sharedResourceQueue.addToQueue(i);
      }
    });

    Thread consumerThread = new Thread(() -> {
      System.out.println("Invoked consumer with thread: " + Thread.currentThread().getName());
      for (int i = 0; i <= 10; i++) {
        sharedResourceQueue.removeFromQueue();
      }
    });

    producerThread.start();
    consumerThread.start();
  }
}
