package main.java.syncronized;

public class BankAccount {

  private double balance;

  public void credit(double amount) {
    synchronized (this) {
      balance = balance + amount;
    }
  }

  public synchronized void debit(double amount) {
    balance = balance - amount;
  }

  public double getBalance() {
    return balance;
  }
}
