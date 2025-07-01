import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

class User
{
    //instance variables declaration
    public String name;
    public ArrayList<Book> booksBorrowed;
    
    //constructor method
    public User(String name)
    {
        this.name = name;
        booksBorrowed = new ArrayList<>();
    }

    //print borrowed book data method
    public void displayBorrowedBookInfo()
    {
        for (Book book : booksBorrowed)
        {
            book.displayBookInfo();
        }
    }
}

class Book
{
    //instance variables declaration
    public String title;
    public String author;
    public boolean isAvailable;
    public LocalDate expireDate;


    //constructor method
    public Book(String title, String author, boolean isAvailable)
    {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        expireDate = LocalDate.of(2025, 7, 10);
    }

    //print book data method
    public void displayBookInfo()
    {
        String availability = isAvailable ? "Available" : "Borrowed";
        System.out.println("Title: " + title + "\nAuthor: " + author + "\n" + availability);
    }
}

class Library
{
    //instance variables declaration
    private ArrayList<Book> books;
    private ArrayList<User> users;

    //constructor method
    public Library()
    {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    //add a book to the list - method
    public void addBook(Book book)
    {
        books.add(book);

        System.out.println("Book " + book.title + " added to the library");
    }

    //prints book data in the list - method
    public void displayBooks()
    {
        for (Book book : books)
        {
            book.displayBookInfo();
        }
    }

    //prints available book data in the list - method
    public void displayAvailableBooks()
    {
        for (Book book : books)
        {
            if(book.isAvailable)
            {
                book.displayBookInfo();
            }
        }
    }

    //prints user borrowed book data - method
    public void displayUserBorrowedBooks(String username)
    {
        int userIndex = searchUser(username);

        if(userIndex == -1)
        {
            System.out.println("User " + username + " not found");
            return;
        }
        
        System.out.println("User " + username + " borrowed books:");

        for (Book userBook : users.get(userIndex).booksBorrowed)
        {
            userBook.displayBookInfo();
        }
    }

    //borrows a book in the list - method
    public void borrowBook(String title, String personName)
    {
        User userThatBorrows = null;
        int bookIndex = searchBook(title);

        //checks if the user is already in the list
        for (int i = 0; i < users.size(); i++)
        {
            if(users.get(i).name.compareToIgnoreCase(personName) == 0)
            {
                userThatBorrows = users.get(i);
                break;
            }
        }

        //creates a new user and adds him to the list if not present
        if(userThatBorrows == null)
        {
            userThatBorrows = new User(personName);
            users.add(userThatBorrows);
        }

        //checks if the user wants to borrow more than 3 books.
        //If so, the book won't be added to the list
        if(userThatBorrows.booksBorrowed.size() >= 3)
        {
            System.out.println("You can borrow maximum 3 books per time");
            return;
        }

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
            userThatBorrows.booksBorrowed.add(books.get(bookIndex));

            System.out.println("Book " + title + " borrowed");
        }

        //in case the book is already borrowed
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

        //if the book is borrowed
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

    public int searchUser(String username)
    {
        int userFound = -1;

        for (int i = 0; i < books.size(); i++)
        {
            if(users.get(i).name.compareToIgnoreCase(username) == 0)
            {
                userFound = i;
                break;
            }
        }

        return userFound;
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
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: add a book to the library");
            System.out.println("2: print all available book data");
            System.out.println("3: search a book availability");
            System.out.println("4: borrow a book");
            System.out.println("5: return a book");
            System.out.println("6: print all borrowed book data from a user");
            System.out.println("0: exit");

            //menu input
            menuOption = numScanner.nextInt();

            switch(menuOption)
            {
                //add a book to the library
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

                //print all available book data
                case 2:
                    library.displayAvailableBooks();
                    break;

                //search a book availability
                case 3:
                    bookTitle = "";

                    //title input
                    System.out.println("Insert the book title to check the availability");
                    bookTitle = stringScanner.nextLine();

                    if(library.searchBook(bookTitle) == -1)
                    {
                        System.out.println("Book not found in the library");
                    }

                    else
                    {
                        System.out.println("Book in the library available");
                    }
                    break;

                //borrow a book
                case 4:
                    bookTitle = "";
                    String userThatBorrows = "";

                    //title input
                    System.out.println("Insert the book title you want to borrow");
                    bookTitle = stringScanner.nextLine();

                    //user input
                    System.out.println("Insert the name of the user");
                    userThatBorrows = stringScanner.nextLine();

                    library.borrowBook(bookTitle, userThatBorrows);
                    break;

                //return a book
                case 5:
                    bookTitle = "";

                    //title input
                    System.out.println("Insert the book title you want to return");
                    bookTitle = stringScanner.nextLine();

                    library.returnBook(bookTitle);
                    break;

                case 6:
                    userThatBorrows = "";    

                    //user input
                    System.out.println("Insert the name of the user");
                    userThatBorrows = stringScanner.nextLine();

                    library.displayUserBorrowedBooks(userThatBorrows);
                    break;

                //exit
                case 0:
                    break;

                //menu input not available
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
