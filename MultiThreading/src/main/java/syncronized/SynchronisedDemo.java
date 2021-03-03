package main.java.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchronisedDemo {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();

    ExecutorService executorService;
    executorService = Executors.newFixedThreadPool(10);

    IntStream.rangeClosed(1, 100)
        .forEach(
            i -> {
              executorService.submit(
                  () -> {
                    bankAccount.debit(100);
                  });

              executorService.submit(
                  () -> {
                    bankAccount.credit(100);
                  });
            });

    executorService.shutdown();
    System.out.println("Final Balance: " + bankAccount.getBalance());
  }
}
