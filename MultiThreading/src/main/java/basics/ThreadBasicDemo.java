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
        Thread thread = new Thread(new MyRunnableThread());

        myThread.start();
        thread.start();
    }
}
