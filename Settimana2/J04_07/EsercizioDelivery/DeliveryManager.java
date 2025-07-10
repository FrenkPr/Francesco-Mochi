import java.util.ArrayList;

interface Trackable
{
    public void trackDelivery(String trackingCode); //simulates the track delivery
}

abstract class VehicleDelivery
{
    //instance variables declaration
    private String licensePlate;
    private float maxLoad;

    protected VehicleDelivery(String licensePlate, float maxLoad)
    {
        this.licensePlate = licensePlate;
        this.maxLoad = maxLoad;
    }

    //method to be implemented in child classes
    abstract public void deliverPack(String destination);

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void printInfo()
    {
        System.out.println("License plate: " + licensePlate + "\nMax load: " + maxLoad);
    }
}

class Van extends VehicleDelivery implements Trackable
{
    public Van(String licensePlate, float maxLoad)
    {
        super(licensePlate, maxLoad);
    }

    @Override
    public void trackDelivery(String trackingCode)
    {
        System.out.println("Van delivery code: " + trackingCode);
    }

    @Override
    public void deliverPack(String destination)
    {
        System.out.println("The van " + getLicensePlate() + " is deliverying at the " + destination + " street");
    }
}

class Drone extends VehicleDelivery implements Trackable
{
    public Drone(String licensePlate, float maxLoad)
    {
        super(licensePlate, maxLoad);
    }

    @Override
    public void trackDelivery(String trackingCode)
    {
        System.out.println("Automatic tracking......\nDrone delivery code: " + trackingCode);
    }

    @Override
    public void deliverPack(String destination)
    {
        System.out.println("The drone " + getLicensePlate() + " is flying over the " + destination + " street");
    }
}

public class DeliveryManager
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int menuOption = 0;
        ArrayList<VehicleDelivery> vehicles;

        do
        {
            //menu description
            System.out.println("\nDeliver Manager:");
            System.out.println("Choose which operations you want to excute:");
            System.out.println("1: add a book to the library");
            System.out.println("2: print all available book data");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    break;

                //option 2
                case 2:
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

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}