package javaconcepts.multithreading;

import javaconcepts.multithreading.deprecatedmethods.SharedDeprecatedResource;

public class PriorityThreadAndDemonAndJoinExamples {

  public static void main(String[] args) {
    SharedDeprecatedResource sharedDeprecatedResource = new SharedDeprecatedResource();

    Thread t1 = new Thread(() -> {
      System.out.println("thread1 called producer method");
      sharedDeprecatedResource.addItem();
    });

    Thread t2 = new Thread(() -> {
      System.out.println("thread2 called producer method");
      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      sharedDeprecatedResource.addItem();
    });

    t1.start();
    t1.setDaemon(true); // Demon thread will alive only one of the user thread is alive
    t2.start();
    t2.setPriority(10);

    try {
      Thread.sleep(1000); // sleep on main thread
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    try {
      System.out.println("Main thread is waiting for thread2 to finish");
      t2.join(); // It will ensure that main thread will wait until thread two is completed
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Main Thread finish");
  }
}
