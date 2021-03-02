package main.java.basics;

class MyThread extends Thread {
  public void run() {
    System.out.println("Thread Id : " + Thread.currentThread().getId());
  }
}

class MyRunnableThread implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread Id : " + Thread.currentThread().getId());
  }
}

public class ThreadBasicDemo {
  public static void main(String[] args) {
    System.out.println("Main Thread Id : " + Thread.currentThread().getId());

    MyThread myThread = new MyThread();

    MyRunnableThread runnable = new MyRunnableThread();
    Thread thread = new Thread(runnable);

    myThread.start();
    thread.start();
  }
}
