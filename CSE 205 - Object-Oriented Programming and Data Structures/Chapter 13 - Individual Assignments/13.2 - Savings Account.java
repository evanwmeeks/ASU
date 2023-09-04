
public class SavingsAccount extends BankAccount
{
	@Override
	public boolean debit(int pennies)
	{
		if(balance < pennies)
			return false;
		balance = balance - pennies; 
		return true;
	}
	
	@Override
	public void applyInterest()
	{
		if(balance>0)
		{
			double interest = balance * interestRate;
			balance = (int)(balance + interest); 
		}
	}
	
	@Override
	public String accountInfo()
	{
		String str = "Type of Account : Savings\n";
		str += "Account ID      : " + getAccountID() + "\n";
		str += String.format("Current Balance : $%.2f\n", getBalance()/100.0);
		str += String.format("Interest rate   : %.2f%%\n", 100*getInterestRate());
		return str;
	}
}
