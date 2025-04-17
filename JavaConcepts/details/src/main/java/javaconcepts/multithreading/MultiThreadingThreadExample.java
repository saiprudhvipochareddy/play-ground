package javaconcepts.multithreading;

public class MultiThreadingThreadExample extends Thread {

  @Override
  public void run() {
    System.out.println("Inside code block in thread example: " + Thread.currentThread().getName());
  }

}
