/*
Problem 13: Bank Deposit & Withdrawal
Scenario: Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance.
*/


class Bank{
     
	 double amount;
	 double balance;
	 String accountHolder;
	 
	Bank(String accountHolder,double balance)
    {
         this.accountHolder=accountHolder;
	     this.balance=balance;
		 this.amount=amount;
    }
	
	void deposit (double amount)
	{
	   balance+=amount;
	   System.out.println("Deposited: " + amount);  
	}
	
	void withdraw(double amount)
	{
	   balance-=amount;
	   System.out.println("Withdrawal: " +amount);
	}
	
	void display()
	{
	   System.out.println("AccountHolder: "+accountHolder+ " Balance: "+balance);
	}
}
class BankDepositWithdraw
{
       public static void main(String args[])
	   {
	   
	   Bank b1 = new Bank("Ram",50000);
	   Bank b2 =new Bank("Sham",300000);
	   
	   b1.deposit(20000);
	   b2.withdraw(100000);
	   
	   b1.display();
	   b2.display();
	   
	   }
	
}

/*
D:\OOPJ Assignment2>javac BankDepositWithdraw.java

D:\OOPJ Assignment2>java BankDepositWithdraw
Deposited: 20000.0
Withdrawal: 100000.0
AccountHolder: Ram Balance: 70000.0
AccountHolder: Sham Balance: 200000.0
*/