package javaconcepts.multithreading.deprecatedmethods;

public class SharedDeprecatedMain {

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
    t2.start();

    try {
      Thread.sleep(1000); // sleep on main thread
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Thread1 is suspended");
    // Deprecated method -1
    t1.suspend(); // no lock is released that is the functionality of suspend

    System.out.println("Thread1 is resume");
    // Deprecated method -2
    t1.resume();

    System.out.println("Thread1 is stop");
    // Deprecated method -3
    t1.stop();

  }
}
