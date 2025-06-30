class Book
{
    //instance variables declaration
    private String title;
    private String author;
    private double price;

    //static variable declaration & init
    private static int numCodeInc = 0;

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;

        numCodeInc++;

        System.out.println("Added " + numCodeInc + "book/s");
    }

    public void printData()
    {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nprice: " + price);
    }
}

public class EsercizioLibri
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Dorian Gray", "Lmao", 49.99);
        Book b2 = new Book("It", "Stephen King", 29.99);
    
        b1.printData();
        b2.printData();
    }
}
