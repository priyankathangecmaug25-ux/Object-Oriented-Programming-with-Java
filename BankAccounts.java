/*
Problem 8: Bank Account Initialization
Scenario: A bank wants to initialize the interest rate for all accounts once when the system starts. Each account has account holder name, balance, and interest rate. Students should practice static blocks for initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/

class BankAccount
{
   String name;
   double balance;
   
   static double interest_rate;
   
   BankAccount(String name,double balance)
   {
      this.name=name;
	  this.balance=balance;
   }
   static void display()
   {
	   interest_rate=4.0;
	  System.out.println("Bank Interest Rate Initialized: "+interest_rate+"%");
   }
}
class BankAccounts
{
     public static void main(String args[])
	 {
	    BankAccount.display();
		
	    BankAccount b1 = new BankAccount("Rohit", 5000);
		BankAccount b2 = new BankAccount("Priya", 15000);
		
		System.out.println("Account1: Name=" +b1.name+ ", Balance=" +b1.balance+ "Interest Rate=" +b1.interest_rate+"%");
		System.out.println("Account2: Name=" +b2.name+ ", Balance=" +b2.balance+ "Interest Rate=" +b2.interest_rate+"%");
	 
	 }
}