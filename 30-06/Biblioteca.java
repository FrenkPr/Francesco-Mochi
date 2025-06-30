import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    //instance variables declaration
    public String title;
    public String author;
    public boolean isAvailable;

    //constructor method
    public Book(String title, String author, boolean isAvailable)
    {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //print book data method
    public void displayBookInfo()
    {
        String availability = isAvailable ? "Available" : "Not available";
        System.out.println("Title: " + title + "\nAuthor: " + author + "\n" + availability);
    }
}

class Library
{
    //instance variables declaration
    private ArrayList<Book> books;

    //constructor method
    public Library()
    {
        books = new ArrayList<>();
    }

    //add a book to the list method
    public void addBook(Book book)
    {
        books.add(book);

        System.out.println("Book " + book.title + " added to the library");
    }

    //prints book data in the list method
    public void displayBooks()
    {
        for (Book book : books)
        {
            book.displayBookInfo();
        }
    }

    //borrows a book in the list
    public void borrowBook(String title)
    {
        int bookIndex = searchBook(title);

        //in case the book has not been found in the library
        if(bookIndex == -1)
        {
            System.out.println("Book " + title + " not available in the library");
            return;
        }

        //if the book is available
        if(books.get(bookIndex).isAvailable)
        {
            books.get(bookIndex).isAvailable = false;
            System.out.println("Book " + title + " borrowed");
        }

        //in case the book is already in borrow
        else
        {
            System.out.println("Book " + title + " is already in borrow");
        }
    }

    //returns a book in the list
    public void returnBook(String title)
    {
        int bookIndex = searchBook(title);

        //in case the book has not been found in the library
        if(bookIndex == -1)
        {
            System.out.println("You can't return a book not available in the library.\nBook " + title + " not available");
            return;
        }

        //if the book is available
        if(!books.get(bookIndex).isAvailable)
        {
            books.get(bookIndex).isAvailable = true;
            System.out.println("Book " + title + " returned");
        }

        //in case the book was already returned
        else
        {
            System.out.println("The book " + title + " was already returned");
        } 
    }

    //returns the book index if found.
    //returns -1 if the book has not been found in the library
    public int searchBook(String title)
    {
        int searchBookResult = -1;

        for (int i = 0; i < books.size(); i++)
        {
            if(books.get(i).title.compareToIgnoreCase(title) == 0)
            {
                searchBookResult = i;
                break;
            }
        }

        return searchBookResult;
    }
}

public class Biblioteca
{
    public static void main(String[] args)
    {
        //variables declaration & init
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int menuOption = 0;
        Library library = new Library();

        do
        {
            //menu description
            System.out.println("Choose which operations you want to excute:");
            System.out.println("1: add a book to the library");
            System.out.println("2: print all book data");
            System.out.println("3: borrow a book");
            System.out.println("4: return a book");
            System.out.println("0: exit");

            //menu input
            menuOption = numScanner.nextInt();

            switch(menuOption)
            {
                case 1:
                    //local variables
                    String bookTitle = "";
                    String bookAuthor = "";

                    //title input
                    System.out.println("Insert a book title");
                    bookTitle = stringScanner.nextLine();

                    //author input
                    System.out.println("Insert the author of the book");
                    bookAuthor = stringScanner.nextLine();

                    library.addBook(new Book(bookTitle, bookAuthor, true));
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    bookTitle = "";

                    //title input
                    System.out.println("Insert the book title you want to borrow");
                    bookTitle = stringScanner.nextLine();

                    library.borrowBook(bookTitle);
                    break;

                case 4:
                    bookTitle = "";

                    //title input
                    System.out.println("Insert the book title you want to return");
                    bookTitle = stringScanner.nextLine();

                    library.returnBook(bookTitle);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Insert a valid option");
                    break;

            }
        }
        while(menuOption != 0);

        //closes scanners usage
        numScanner.close();
        stringScanner.close();
    }
}
