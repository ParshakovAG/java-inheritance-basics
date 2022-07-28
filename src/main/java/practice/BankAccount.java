package practice;

public class BankAccount {

    private double amount;

    public BankAccount() {
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {

        if (amountToPut >= 0) {
            amount += amountToPut;
            System.out.println(getAmount());
        }
    }

    public boolean take(double amountToTake) {

        if (amountToTake > getAmount() || amountToTake < 0) {
            System.out.println("Недостаточно средств для вывода");
            return false;
        } else {
            amount -= amountToTake;
            System.out.println(getAmount());
            return true;
        }
    }
}
