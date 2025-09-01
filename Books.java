/* Problem 3: Library Book Tracker
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.
Requirements:
1. Create a Book class with instance variables: title (String), author (String), issued (boolean).
2. Create static variable totalIssuedBooks to keep track of the total number of books issued.
3. Create a constructor to initialize the book details.
4. Create getters and setters for all instance variables.
5. Create a static method showTotalIssued() to print total issued books.
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued books.
Input Example:
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true
Expected Output:
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2 */


class Book
{
    String title;
	String author;
	boolean issued;
	
	static int  totalIssuedBooks = 0;
	
	Book( String title, String author, boolean issued)
	{
	 this.title=title;
	 this.author=author;
	 this.issued=issued;
	 //this.totalIssuedBooks=totalIssuedBooks;
	 //if (issued) totalIssuedBooks++;
	 if (issued == true)
	{
       totalIssuedBooks = totalIssuedBooks + 1;
    }
	}
	
	 static void showTotalIssued()
	 {
	  System.out.println("Total books issued: "+totalIssuedBooks);
	 }

}
public class Books
{
    public static void main(String args[])
	{
	   Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
	   Book b2 = new Book("Five Point Someone", "Chetan Bhagat", false);
	   Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki",true);
	   
	   	System.out.println(b1.title + " issued? " + b1.issued);
        System.out.println(b2.title + " issued? " + b2.issued);
        System.out.println(b3.title + " issued? " + b3.issued);

	   Book.showTotalIssued();
	   
	
	}


}