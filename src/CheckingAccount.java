public class CheckingAccount extends BankAccount{
    double fee;

    public CheckingAccount(int number, int balance, double fee) {
        super (number, balance);
        this.fee = fee;
    }
}
