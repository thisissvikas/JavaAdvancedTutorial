package main.java.singelton;

public class BankAccount {

  public static BankAccount bankAccount = new BankAccount();

  private BankAccount(){}

  private long accountNumber = 102020321013L;
  private int balance = 0;

  public int getBalance() {
    return balance;
  }

  public void addMoney(int money) {
    balance += money;
  }

  public void spendMoney(int money) {
    balance -= money;
  }
}
