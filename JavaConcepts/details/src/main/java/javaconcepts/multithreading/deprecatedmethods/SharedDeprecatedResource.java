package javaconcepts.multithreading.deprecatedmethods;

public class SharedDeprecatedResource {
  boolean isItemPresent = false;

  public synchronized void addItem() { // Here monitor lock applied
    System.out.println("Lock acquired");
    isItemPresent = true;
    try {
      Thread.sleep(8000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Lock release");
  }

}
