package main.java.singelton;

public class HDFCBank {

  public static HDFCBank bankAccount;

  private HDFCBank() {}

  public static HDFCBank getInstance() {
    if (bankAccount == null) {
      bankAccount = new HDFCBank();
    }
    return bankAccount;
  }

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
