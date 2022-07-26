package practice;

public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
    private static final double COMMISSION_FEE = 0.01;

    public CardAccount() {
    }

    public CardAccount(double amount) {
        super(amount);
    }

    private double getAmountWithCommission(double amount) {
        return amount * COMMISSION_FEE;
    }

    @Override
    public boolean take(double amountToTake) {
        return super.take(amountToTake + getAmountWithCommission(amountToTake));
    }
}
