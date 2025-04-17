package javaconcepts.completablefutures;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

public class FutureExample {

  public static void main(String[] args) {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1, TimeUnit.DAYS,
        new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new AbortPolicy());

    Future<?> futureObject = threadPoolExecutor.submit(() -> { //Runnable
      try {
        System.out.println("First future start's at: " + new Date());
        Thread.sleep(8000);
        System.out.println("this the task, which thread will execute!");
        System.out.println("First future end's at: " + new Date());
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    Future<Integer> futureObject1 = threadPoolExecutor.submit(() -> {
      System.out.println("Second future start's at: " + new Date());
      Integer a = 1;
      Integer b = 2;
      Thread.sleep(2000);
      System.out.println("Second future end's at: " + new Date());
      return a + b;
    }); // Callable

    List<Integer> output = new ArrayList<>();

    Future<List<Integer>> futureObjectWithReturnType = threadPoolExecutor.submit(() -> {
      System.out.println("third future start's at: " + new Date());
      output.add(600);
    }, output); // submit with return type

    try {
      List<Integer> futureObjectOutput = futureObjectWithReturnType.get();
      System.out.println("Output with return type: " + futureObjectOutput.get(0));
    } catch (Exception e) {
      System.out.println();
    }

    //Runnable vs Callable
    //Runnable doesn't return
    //Callable return v

    System.out.println(
        "Is task done: " + futureObject.isDone()); //It will say is the task is completed

    try {
      futureObject.get(2, TimeUnit.SECONDS);
    } catch (Exception e) {
      System.out.println();
    }
    // This will make sure it will call get and if thread is running after 2 sec it moves further

    try {
      futureObject.get();// Here basically main thread wait unit futureObject execute gets complete
    } catch (Exception e) {
      System.out.println();
    }

    System.out.println("Is Done: " + futureObject.isDone());
    System.out.println("Is Cancelled: " + futureObject.isCancelled());
  }

}
