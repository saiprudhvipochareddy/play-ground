package javaconcepts.multithreading;

public class MultiThreadingMain {

  public static void main(String[] args) {
    System.out.println("Going inside main thread Runnable example: " + Thread.currentThread().getName());
    MultiThreadingRunnableExample multiThreadingRunnableExample = new MultiThreadingRunnableExample();
    Thread thread = new Thread(multiThreadingRunnableExample);
    thread.run(); // This will just run the code in the current thread, NOT in a new thread.
    thread.start(); // This will start the thread, which will then call run() internally in a new thread.
    System.out.println("Finish main thread Runnable example: " + Thread.currentThread().getName());

    System.out.println("Going inside main thread Thread example: " + Thread.currentThread().getName());
    MultiThreadingThreadExample multiThreadingThreadExample = new MultiThreadingThreadExample();
    multiThreadingThreadExample.start(); 
    System.out.println("Finish main thread using Thread example: " + Thread.currentThread().getName());
  }

}
