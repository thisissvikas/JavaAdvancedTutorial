package main.java.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class MyCallable implements Callable<String> {

  @Override
  public String call() throws Exception {
    Thread.sleep(3000);
    int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
    return "Some Value : " + randomNum;
  }
}
