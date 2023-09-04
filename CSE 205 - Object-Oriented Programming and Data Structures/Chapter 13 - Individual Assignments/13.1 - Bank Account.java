public abstract class BankAccount {
    protected int balance = 0;
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;

    public boolean credit(int amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public abstract boolean debit(int amount);

    public int getBalance() {
        return balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String id) {
        accountID = id;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public abstract void applyInterest();

    public abstract String accountInfo();
}
