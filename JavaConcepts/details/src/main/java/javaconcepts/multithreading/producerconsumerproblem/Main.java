package javaconcepts.multithreading.producerconsumerproblem;

public class Main {

  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();
    Thread thread1 = new Thread(new ProducerTask(sharedResource));
    Thread thread2 = new Thread(new ConsumerTask(sharedResource));

    thread1.start();
    thread2.start();
    try {
      System.out.println("Main thread is waiting for thread2 to finish");
      thread2.join(); // It will ensure that main thread will wait until thread two is completed
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Main thread finish");
  }
}
