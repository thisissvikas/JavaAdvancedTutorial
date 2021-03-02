package main.java.basics;

class SmartRunnable implements Runnable {
  private final int value;

  SmartRunnable(int value) {
    this.value = value;
  }

  @Override
  public void run() {
    System.out.printf(
        "Thread Id : %s, Computed Value = %s%n",
        Thread.currentThread().getId(), Math.pow(value, 2));
  }
}

public class AdvancedThreadDemo {
  public static void main(String[] args) {
    System.out.println("Main Thread Id : " + Thread.currentThread().getId());

    for (int i = 0; i < 5; i++) {
      Thread thread = new Thread(new SmartRunnable(i));
      thread.start();
    }
  }
}
