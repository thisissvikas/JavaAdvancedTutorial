package main.java.executors;

public class MyRunnable implements Runnable {
  private final int value;

  MyRunnable(int value) {
    this.value = value;
  }

  @Override
  public void run() {
    System.out.printf(
        "Thread Id : %s, Computed Value = %s%n",
        Thread.currentThread().getId(), Math.pow(value, 2));
  }
}
