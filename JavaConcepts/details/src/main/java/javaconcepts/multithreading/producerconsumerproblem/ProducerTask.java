package javaconcepts.multithreading.producerconsumerproblem;

public class ProducerTask implements Runnable {

  private final SharedResource sharedResource;

  public ProducerTask(SharedResource sharedResource) {
    this.sharedResource = sharedResource;
  }

  @Override
  public void run() {
    System.out.println("Called producer by thread: " + Thread.currentThread().getName());
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    sharedResource.addItem();
  }
}
