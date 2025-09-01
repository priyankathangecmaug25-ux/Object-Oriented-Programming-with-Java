/*
Problem 17: Library Book Addition
Scenario: Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books
*/

class Book
{
   int bookId;
   String title;
   String author;
   
   Book(int bookId, String title, String author)
   {
      this.bookId=bookId;
	  this.title=title;
	  this.author=author;
   }

   //setters
     void setBookId(int bookId)
	 {
	    this.bookId=bookId;
	 }
	 void setTitle(String title)
	 {
	    this.title=title;
	 }
	 void setAuthor(String author)
	 {
	   this.author=author;
	 }
	 
	 //getters
	 
	 int getBookId()
	 {
	  return bookId;
	 }
	 String getAuthor()
	 {
	    return author;
	 }
	 String getTitle()
	 {
	    return title;
	 }
	 
}
class Library
{
     String libraryName;
	 static int totalBooks=0;
	 
	 Library(String libraryName) 
	{
        this.libraryName = libraryName;
    }
	
	 void addBook(Book b)
	 {
	    totalBooks++;
	    System.out.println("Added Book:-- Book Id:" +b.getBookId()+ ", Title:" +b.getTitle()+ ", Author:" +b.getAuthor());
	 }
	  
	 void displayTotalBooks()
	 {
	     System.out.println("Total Books in Library: "+totalBooks);
	 }
	 
}
class LibraryBooksAdd
{  
    public static void main(String[] args) 
	{
     Library l1 = new Library("Indian Library");
	 Book b = new Book(1, "Marathi", "Ram Patil");
	 Book b1 = new Book(2, "JAVA", "James Gosling");
  
	  l1.addBook(b);
      l1.addBook(b1);

      l1.displayTotalBooks();
	} 

}