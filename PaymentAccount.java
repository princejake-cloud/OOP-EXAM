public class PaymentAccount {
    private double balance;

    public PaymentAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw " + amount + "; available balance is only " + balance);
        }
        balance -= amount;
    }
}
