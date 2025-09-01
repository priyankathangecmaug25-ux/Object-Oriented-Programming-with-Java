/*
Problem 14: Bank Name Display
Scenario: Add a static variable bankName = "CDAC Bank" and static method displayBankName() to BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation
*/

class Bank
{
     static String bankName;
	 String accountHolder;
	 int balance;
	 
	 
	 Bank(String accountHolder,int balance)
	 {
	    this.bankName=bankName;
		this.accountHolder=accountHolder;
		this. balance= balance;
	 }
	 
	 static void displayBankName()
	 {
	    bankName="CDAC Bank";
		System.out.println("Bank Name: " +bankName);
		
	 }

}
class BankName
{
    public static void main(String args[])
	{
	   Bank.displayBankName();
	   Bank b1 = new Bank("Aaditya",250000);
	   System.out.println("Account Holder: "+b1.accountHolder+ " BankBalance: "+b1.balance);
	  
	}

}

/*
D:\OOPJ Assignment2>javac BankName.java

D:\OOPJ Assignment2>java BankName
Bank Name: CDAC Bank
Name: Aaditya BankBalance: 250000

*/