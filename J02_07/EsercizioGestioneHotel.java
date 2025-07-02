import java.util.ArrayList;

class Room
{
    //attributes declaration
    private int roomNumber;
    private float price;

    public Room(int roomNumber, float price)
    {
        setRoomNumber(roomNumber);
        setPrice(price);
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int newRoomNumber)
    {
        while(newRoomNumber < 0)
        {
            System.out.println("Insert a number greater than or equal to 0");
            newRoomNumber = GlobalScanner.readIntInput();
        }

        roomNumber = newRoomNumber;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float newPrice)
    {
        while(newPrice <= 0.0f)
        {
            System.out.println("Insert a valid price: greater than 0");
            newPrice = GlobalScanner.readFloatInput();
        }

        price = newPrice;
    }

    //prints camera details
    public void details()
    {
        System.out.println("Number of room: " + roomNumber + "\nPrice: " + price);
    }

    public void details(boolean printPrice)
    {
        if(printPrice)
        {
            details();
            return;
        }

        System.out.println("Number of room: " + roomNumber);
    }
}

class Suite extends Room
{
    private String extraServices;

    public Suite(int roomNumber, float price, String extraServices)
    {
        super(roomNumber, price);
    }
}

public class EsercizioGestioneHotel
{
    public static void main(String[] args)
    {
        GlobalScanner.InitScannerInputs();

        
    }
}
