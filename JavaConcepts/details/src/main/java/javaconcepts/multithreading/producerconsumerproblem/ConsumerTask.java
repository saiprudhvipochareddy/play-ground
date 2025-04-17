package javaconcepts.multithreading.producerconsumerproblem;

public class ConsumerTask implements Runnable {

  private final SharedResource sharedResource;

  public ConsumerTask(SharedResource sharedResource) {
    this.sharedResource = sharedResource;
  }

  @Override
  public void run() {
    System.out.println("Called consumer by thread: " + Thread.currentThread().getName());
    sharedResource.removeItem();
  }
}
