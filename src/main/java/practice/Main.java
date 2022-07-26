package practice;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.put(1200);
        System.out.println(bankAccount.take(300));

        CardAccount cardAccount = new CardAccount();
        cardAccount.put(500);
        System.out.println(cardAccount.take(150));

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(200);
        System.out.println(depositAccount.take(100));
    }
}
