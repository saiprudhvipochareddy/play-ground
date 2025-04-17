package javaconcepts.multithreading.producerconsumerproblem.assignment;

import java.util.Queue;

public class SharedResourceQueueImpl {

  private final Queue<Integer> integerQueue;
  private final Integer bufferSize;

  public SharedResourceQueueImpl(Queue<Integer> integerQueue, Integer bufferSize) {
    this.integerQueue = integerQueue;
    this.bufferSize = bufferSize;
  }

  public synchronized void addToQueue(Integer value) {
    while (integerQueue.size() == bufferSize) {
      System.out.println("Size is full don't insert values to queue");
      try {
        wait();// it will release the monitor lock and wait in the waiting state
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    integerQueue.offer(value);
    notifyAll();
    System.out.println("Added value to queue: " + value);
  }
  public synchronized void removeFromQueue() {
     while (integerQueue.isEmpty()) {
       try {
         System.out.println("consumer thread is waiting: " + Thread.currentThread().getName());
         wait();
       } catch (InterruptedException e) {
         throw new RuntimeException(e);
       }
     }
    System.out.println("Removed value to queue: " + integerQueue.poll());
     notifyAll();
  }
}
