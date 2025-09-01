/*
Problem 7: Indian Movie Ticket Booking
Scenario: A cinema hall offers Normal and Premium tickets. A customer can book just name or name with ticket type. Keep track of total tickets sold using a static counter.
Tasks:
1. Create a Customer class.
2. Implement two constructors:
Constructor 1 → Customer(String name)
Constructor 2 → Customer(String name, String ticketType)
3. Static counter to track tickets sold.
4. Print customer details and total tickets sold.
Input Example:
Customer1: "Rahul"
Customer2: "Pooja", "Premium"
Customer3: "Amit"
Expected Output:
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/

class Customer
{
     String name;
	 String ticketType;
	 static int tickets_sold=0;
	 
	 Customer(String name)
	 {
	    this.name=name;
		this.ticketType="normal";
		tickets_sold++;
	 }
	 
	 Customer(String name, String ticketType)
	 {
	    this.name=name;
		this.ticketType=ticketType;
		tickets_sold++;
	 }
	 
	 static void counter()
	 {
	    System.out.println("Total Tickets Sold: "+tickets_sold);
	 }

}
class Customers
{
    public static void main(String args[])
	{
	     Customer c1 = new Customer("Rahul");
		 Customer c2 = new Customer("Pooja", "Premium");
		 Customer c3 = new Customer("Amit");
		 
		 System.out.println("Customer1: Name: " +c1.name+ ", Ticket: " +c1.ticketType);
		 System.out.println("Customer2: Name: " +c2.name+ ", Ticket: " +c2.ticketType);
		 System.out.println("Customer3: Name: " +c3.name+ ", Ticket: " +c3.ticketType);
		 
		 Customer.counter();
    }


}