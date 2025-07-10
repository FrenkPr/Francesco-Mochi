interface IVehicle
{
    public void start();
    public void showType();
}

class Car implements IVehicle
{
    public void start()
    {
        System.out.println("The car is starting.......");
    }

    public void showType()
    {
        System.out.println("Type: car");
    }
}

class Motorcycle implements IVehicle
{
    public void start()
    {
        System.out.println("The motorcycle is starting.......");
    }

    public void showType()
    {
        System.out.println("Type: motorcycle");
    }
}

class Camion implements IVehicle
{
    public void start()
    {
        System.out.println("The camion is starting.......");
    }

    public void showType()
    {
        System.out.println("Type: camion");
    }
}

class VehicleFactory
{
    public static IVehicle CreateVehicle(String type)
    {
        switch(type.toLowerCase())
        {
            case "car":
                return new Car();

            case "motorcycle":
                return new Motorcycle();

            case "camion":
                return new Camion();
            
            default:
                return null;
        }
    }
}

public class EsercizioVeicoliFactory
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables, instance variables declaration & init
        int menuOption = 0;
        IVehicle vehicle = null;

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: insert vehicle data");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    String carType = "";
                    carType = GlobalScanner.readStringInput("Insert vehicle type (car, motorcycle, camion)", false);

                    vehicle = VehicleFactory.CreateVehicle(carType);

                    if(vehicle != null)
                    {
                        vehicle.start();
                        vehicle.showType();
                    }

                    else
                    {
                        System.out.println("Insert a valid vehicle type");
                    }
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