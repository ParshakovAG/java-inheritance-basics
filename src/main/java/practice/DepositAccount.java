package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    public DepositAccount() {
    }

    public DepositAccount(double amount) {
        super(amount);
    }

    private LocalDate lastIncome;

    @Override
    public boolean take(double amountToTake) {
        LocalDate dateCanTake = lastIncome.plusMonths(1);
        if (LocalDate.now().isAfter(dateCanTake)) {
            super.take(amountToTake);
            return true;
        } else
            System.out.println("Вы сможете снять деньги со счета после " + dateCanTake);
        return false;
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }
}
