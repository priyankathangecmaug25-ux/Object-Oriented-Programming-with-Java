/*
Problem 12: Bank Account Basic Info
Scenario: Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details.
*/

class BankAccount
{
       String accountHolder;
       double balance;
   
      BankAccount(String accountHolder,double balance)
      {
         this.accountHolder=accountHolder;
	     this.balance=balance;
      }
   
           //getter
       double getBalance()
	   {
            return balance;
       }
   
         //setter
       void setBalance(double balance)
	   {
          this.balance=balance;
       }

}
class BankAccountset
{   
     public static void main(String args[])
	 {
	    BankAccount b1 = new BankAccount("Balasaheb",50000);
		b1.setBalance(80000);
		
		System.out.println("Name: " +b1.accountHolder+ ", Balance: " +b1.getBalance());
	
	 }
}

/*
D:\OOPJ Assignment2>javac BankAccountset.java

D:\OOPJ Assignment2>java BankAccountset
Name: Balasaheb, Balance: 80000.0
*/