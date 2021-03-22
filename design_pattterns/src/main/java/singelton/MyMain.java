package main.java.singelton;

public class MyMain {
  public static void main(String[] args) {
//    BankAccount bankAccount = BankAccount.bankAccount;
//    bankAccount.addMoney(100);
//    bankAccount.spendMoney(30);
//    System.out.println(bankAccount.getBalance());
//
//    BankAccount bankAccount2 = BankAccount.bankAccount;
//    bankAccount2.addMoney(100);
//    bankAccount2.spendMoney(30);
//    System.out.println(bankAccount2.getBalance());

    HDFCBank hdfc = HDFCBank.getInstance();
    hdfc.addMoney(100);
    hdfc.spendMoney(30);
    System.out.println(hdfc.getBalance());

    HDFCBank hdfc2 = HDFCBank.getInstance();
    hdfc2.addMoney(100);
    hdfc2.spendMoney(30);
    System.out.println(hdfc2.getBalance());


  }
}
