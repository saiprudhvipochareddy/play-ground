package javaconcepts.multithreading;

public class MonitorLogExample {

  public synchronized void task1() { // monitor lock added
    System.out.println("Inside Task1");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("task1 completed");
  }

  public void task2() {
    System.out.println("Inside task2");
    synchronized (this) { //synchronized block
      System.out.println("task2 inside synchronized block");
      // this block has to wait until thread1 completed
    }
  }

  public void task3() {
    System.out.println("Inside Task3");
  }

}
