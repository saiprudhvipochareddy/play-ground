package javaconcepts.multithreading.producerconsumerproblem;

public class SharedResource {

  boolean isItemPresent = false;

  public synchronized void addItem() { // Here monitor lock applied
    System.out.println("Invoked addItem with thread: " + Thread.currentThread().getName());
    isItemPresent = true;
    notifyAll();
    System.out.println("Completed addItem with thread: " + Thread.currentThread().getName());
  }

  public synchronized void removeItem() {
    System.out.println("Invoked removeItem with thread: " + Thread.currentThread().getName());

    while (!isItemPresent) {
      try {
        System.out.println("consumer thread is waiting: " + Thread.currentThread().getName());
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    isItemPresent = false;
    System.out.println("Completed removeItem with thread: " + Thread.currentThread().getName());
  }

}
