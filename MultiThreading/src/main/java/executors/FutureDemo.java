package main.java.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    Future<String> future = executorService.submit(new MyCallable());

    while (!future.isDone()) {
//      future.cancel(true);
      System.out.println("Processing task");
    }
    try {
      System.out.println("Value retrieved : " + future.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    executorService.shutdown();
  }
}
