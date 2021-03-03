package main.java.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorBasicDemo {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(1);

    for (int i = 0; i < 2000; i++) {
      MyRunnable runnable = new MyRunnable(i);
      executorService.execute(runnable);
    }
    executorService.shutdown();
  }
}
