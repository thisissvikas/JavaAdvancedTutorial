package main.java.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AdvancedFutureDemo {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    List<MyCallable> myCallables = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      myCallables.add(new MyCallable());
    }

    try {
      List<Future<String>> futures = executorService.invokeAll(myCallables);
      boolean allDone = false;
      while (!allDone) {
        boolean done = true;
        for (Future<String> future : futures) {
          done = done && future.isDone();
        }
        if (!done) {
          System.out.println("Still processing");
        }
        allDone = done;
      }
      for (Future<String> future : futures) {
        System.out.println(future.get());
      }
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    executorService.shutdown();
  }
}
