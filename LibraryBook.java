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
	 
	 // getters
    public int getBookId()
	{
        return bookId;
    }

    public String getTitle()
	{
        return title;
    }

    public String getAuthor() 
	{
        return author;
    }

    // setters
    public void setBookId(int id) 
	{
        this.bookId = id;
    }

    public void setTitle(String title)
	{
        this.title = title;
    }

    public void setAuthor(String author)
	{
        this.author = author;
    }
}

class Library
 {
    String libraryName;
    static int totalBooks = 0;

    Library(String name) 
	{
        this.libraryName = name;
    }

    void addBook(Book b) 
	{
        totalBooks++;
        System.out.println("Book Added -> ID: " + b.getBookId() +", Title: " + b.getTitle()+", Author: " + b.getAuthor());
    }

    void displayTotalBooks() {
	
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

public class  LibraryBook 
 {
    public static void main(String[] args) 
	{
        Library lib = new Library("City Library");

        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "C++", "Bjarne Stroustrup");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}

/*
D:\OOPJ Assignment2>javac LibraryBook.java

D:\OOPJ Assignment2>java LibraryBook
Book Added -> ID: 1, Title: Java Basics, Author: James Gosling
Book Added -> ID: 2, Title: C++, Author: Bjarne Stroustrup
Total Books in Library: 2
*/