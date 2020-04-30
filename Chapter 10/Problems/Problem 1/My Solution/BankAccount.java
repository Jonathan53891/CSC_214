public class BankAccount implements Measurable
{
	private double balance;
	private static int previousAccountNumber = 1000;
	private int accountNumber;
	
	public BankAccount()
	{
		this.balance = 0;
		
		previousAccountNumber++;
		accountNumber = previousAccountNumber;
	}
	
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
		
		previousAccountNumber++;
		accountNumber = previousAccountNumber;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	public void monthEnd()
	{
		// Do Nothing
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String toString()
	{
		return getClass().getName() + "[balance=" + balance + ",accountNumber=" + accountNumber +"]";
	}
	
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
		{
			return false;
		}
		
		if(getClass() != otherObject.getClass())
		{
			return false;
		}
		
		BankAccount other = (BankAccount) otherObject;
		
		return getBalance() == other.getBalance();
	}

	public double getMeasure()
	{
		return this.balance;
	}
	
	public int compareTo(Object otherObject)
	{
		BankAccount other =  (BankAccount) otherObject;
		
		if(balance < other.balance)
		{
			return - 1;
		}
		else if(balance > other.balance)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
