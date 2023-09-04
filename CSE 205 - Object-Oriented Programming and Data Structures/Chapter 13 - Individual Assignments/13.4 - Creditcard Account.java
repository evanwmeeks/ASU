public class CreditcardAccount extends BankAccount {
	private int limit = 0;
	

	@Override 
	public boolean debit(int amount)
	{
		if (this.balance - amount >= this.limit)
		{
			this.balance -= amount;
			return true;
		}

		return false;

	}


	public void setLimit(int amount)
	{
		this.limit = -amount;

	}


	public int getLimit()
	{
		return -limit;

	}

	@Override
	public void applyInterest()
	{
		if(balance<0)
		{
			double interest = balance * interestRate;
			balance = (int)(balance + interest); 
		}

	}

	public String accountInfo()
	{
		String str = "Type of Account : Creditcard\n";
	str += "Account ID      : " + getAccountID() + "\n";
	str += String.format("Current Balance : $%.2f\n", -getBalance()/100.0);
	str += String.format("Interest rate   : %.2f%%\n", 100*getInterestRate());
	str += String.format("Credit Limit    : $%.2f\n", getLimit()/100.0);
	return str;

	}


}