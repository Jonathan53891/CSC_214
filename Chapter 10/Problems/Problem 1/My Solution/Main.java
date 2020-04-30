import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		Measurable[] accounts = new Measurable[3];
		
		accounts[0] = new BankAccount(2000);
		accounts[1] = new BankAccount(3000);
		accounts[2] = new BankAccount(500);
		
		double averageBalance = Data.average(accounts);
		System.out.printf("Average Balance: %.2f\n", averageBalance);
		
		Measurable[] countries = new Measurable[4];
		
		countries[0] = new Country("Spain", 25000);
		countries[1] = new Country("Argentina", 30000);
		countries[2] = new Country("Australia", 100000);
		countries[3] = new Country("Russia", 150000);
		
		double averageArea = Data.average(countries);
		System.out.printf("Average Area: %.2f\n", averageArea);
		
		Measurable meas = new BankAccount(300);
		System.out.printf("Balance: %.2f\n", meas.getMeasure());
		
		Country name = new Country("Mexico", 15000);
		//Named name = new Country("Mexico", 15000);
		System.out.println(name.getName());
		
		BankAccount myAccount = new BankAccount(1000);
		Measurable meas2 = myAccount;
		
		System.out.printf("My Account Balance: %.2f\n", meas2.getMeasure());
		
		Country china = new Country("China", 75000);
		meas2 = china;
		
		System.out.printf("China: %.2f\n", meas2.getMeasure());
		
		BankAccount john = new BankAccount(25000);
		BankAccount david = new BankAccount(3000);
		System.out.println("Larger Account: " + Data.larger(john, david).getMeasure());
		
		Country uruguay = new Country("Uruguary", 176220);
		Country thailand = new Country("Thailand", 513120);
		
		Measurable max = Data.larger(uruguay, thailand);
		Country maxCountry = (Country) max;
		
		String countryname = maxCountry.getCountryName();
		System.out.println("Country Name: " + countryname);
		
		BankAccount[] moreAccount = new BankAccount[4];
		moreAccount[0] = new BankAccount(100);
		moreAccount[1] = new BankAccount(500);
		moreAccount[2] = new BankAccount(80);
		moreAccount[3] = new BankAccount(1000);
		
		for(int i = 0; i < moreAccount.length; i++)
		{
			System.out.print(moreAccount[i].getBalance() + ", ");
		}
		System.out.println();
		
		Arrays.sort(moreAccount);
		
		for(int i = 0; i < moreAccount.length; i++)
		{
			System.out.print(moreAccount[i].getBalance() + ", ");
		}
		System.out.println();
	}
}
