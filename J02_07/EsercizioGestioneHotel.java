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
        setExtraServices(extraServices);
    }

    public String getExtraServices()
    {
        return extraServices;
    }

    public void setExtraServices(String extraServicesUpdated)
    {
        if(extraServicesUpdated.isEmpty())
        {
            extraServicesUpdated = "No extra services added";
        }

        extraServices = extraServicesUpdated;
    }

    @Override
    public void details()
    {
        super.details();
        System.out.println("Extra services: " + extraServices);
    }

    @Override
    public void details(boolean printPrice)
    {
        super.details(printPrice);
        System.out.println("Extra services: " + extraServices);
    }
}

class Hotel
{
    //attributes declaration
    private String name;
    private ArrayList<Room> roomList;

    //constructor method
    public Hotel(String name)
    {
        while(name.isEmpty())
        {
            System.out.println("Insert a valid hotel name");
            name = GlobalScanner.readStringInput();
        }

        roomList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Room> getRoomList()
    {
        return roomList;
    }

    //add a room method
    public void addRoom(Room newRoom)
    {
        //exit if the room specified is null
        if(newRoom == null)
        {
            System.out.println("Insert a valid room. A room can not be null");
            return;
        }

        for (int i = 0; i < roomList.size(); i++)
        {
            if(roomList.get(i).getRoomNumber() == newRoom.getRoomNumber())
            {
                int validRoomNumber = 0;
                
                System.out.println("Number of room " + roomList.get(i).getRoomNumber() + " already existing, insert a new room number");
                validRoomNumber = GlobalScanner.readIntInput();

                newRoom.setRoomNumber(validRoomNumber);

                //reset the index to reiterate and check that
                //the number of room is unique
                i = 0;
            }
        }

        roomList.add(newRoom);
    }

    public void printRoomData(boolean printPrice)
    {
        for (Room room : roomList)
        {
            room.details(printPrice);
        }
    }

    public static int getSuiteCount(ArrayList<Room> rooms)
    {
        int suiteCount = 0;

        for (Room room : rooms)
        {
            //checks if the room is a suite
            if(room instanceof Suite)
            {
                suiteCount++;
            }
        }

        return suiteCount;
    }
}

public class EsercizioGestioneHotel
{
    public static void main(String[] args)
    {
        GlobalScanner.InitScannerInputs();

        Hotel hotel;
        String hotelName = "";

        System.out.println("Insert the hotel name");
        hotelName = GlobalScanner.readStringInput();

        hotel = new Hotel(hotelName);

        hotel.addRoom(null);
        hotel.addRoom(new Room(10, 200.0f));
        hotel.addRoom(new Room(11, 250.0f));

        hotel.addRoom(new Suite(11, 500.0f, ""));
        hotel.addRoom(new Suite(50, 1000.0f, "Champagne with lobster and bed with extra comfort"));
        hotel.addRoom(new Suite(50, 1000.0f, "larger bed with extra comfort and bath tub"));

        System.out.println("HOTEL " + hotelName + " DETAILS:");

        hotel.printRoomData(true);

        System.out.println("\nHOTEL " + hotelName + " DETAILS WITH NO PRICE:");

        hotel.printRoomData(false);

        System.out.print("\n");

        System.out.println("Suite count: " + Hotel.getSuiteCount(hotel.getRoomList()));
    }
}
