package javaconcepts.multithreading;

public class MultiThreadingRunnableExample implements Runnable {

  @Override
  public void run() {
    System.out.println("Inside code block Runnable example: " + Thread.currentThread().getName());
  }
}
