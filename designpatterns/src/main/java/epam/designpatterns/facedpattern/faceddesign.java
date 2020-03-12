package epam.designpatterns.facedpattern;

public class faceddesign {
	void TransferAmount(String AccountNumber1,String AccountNumber2,int amount)
	{
		accountverification accountVerificationReference= new accountverification();
		if(accountVerificationReference.Verification("vikram","1234"))
		{
			new withdrawamount(AccountNumber1,amount);
			new depositamount(AccountNumber2,amount);
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}
	void creditAmount(String AccountNumber,int amount)
	{
		accountverification accountVerificationReference= new accountverification();
		if(accountVerificationReference.Verification("yaswanth","1234"))
		{
			new withdrawamount(AccountNumber,amount);	
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}
	void debitAmount(String AccountNumber,int amount)
	{
		accountverification accountVerificationReference= new accountverification();
		if(accountVerificationReference.Verification("yaswanth","1234"))
		{
			new depositamount(AccountNumber,amount);	
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}
}
