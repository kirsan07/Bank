public class SavingsAccount extends BankAccount{
    double interestRage;

    public SavingsAccount(int number, int balance, double interestRage) {
        super(number, balance);
        this.interestRage = interestRage;
    }
}
