package main.java.basics;

class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread Id : " + Thread.currentThread().getId());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class MultipleThreadDemo {
  public static void main(String[] args) {
    System.out.println("Main Thread Id : " + Thread.currentThread().getId());

    for (int i = 0; i < 5; i++) {
      Thread thread = new Thread(new MyRunnable());
      System.out.println("Created thread Id : " + thread.getId());
      thread.start();
    }
  }
}
