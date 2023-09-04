public class CheckingAccount extends BankAccount{
private int overdraftFee = 0;
	
@Override
public boolean debit(int amount)
{
	this.balance-=amount;
	if (this.balance < 0) {
	   this.balance -= overdraftFee;
	}
	return true;
}


public void setFee (int amount) 
{
	overdraftFee = amount;
}


public int getFee()
{
	return overdraftFee;
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
	String str = "Type of Account : Checking\n";
	str += "Account ID      : " + getAccountID() + "\n";
	str += String.format("Current Balance : $%.2f\n", getBalance()/100.0);
	str += String.format("Interest rate   : %.2f%%\n", 100*getInterestRate());
	str += String.format("Overdraft Fee   : $%.2f\n", getFee()/100.0);
	return str;
}


}