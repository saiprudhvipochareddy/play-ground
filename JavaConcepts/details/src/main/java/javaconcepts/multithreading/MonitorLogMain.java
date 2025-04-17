package javaconcepts.multithreading;

import lombok.SneakyThrows;

public class MonitorLogMain {

  @SneakyThrows
  public static void main(String[] args) throws Exception {
    MonitorLogExample monitorLogExample = new MonitorLogExample();
    Thread t1 = new Thread(monitorLogExample::task1);
    Thread t2 = new Thread(monitorLogExample::task2);
    Thread t3 = new Thread(monitorLogExample::task3);

    t1.start();
    t2.start();
    t3.start();
  }

}
