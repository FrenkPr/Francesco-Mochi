import java.util.ArrayList;
import java.util.Scanner;

class Auto
{
    //instance variables declaration
    private String licensePlate;
    private String model;

    //constructor method
    public Auto(String licensePlate, String model)
    {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    //returns the license plate
    public String getLicensePlate()
    {
        return licensePlate;
    }

    //returns the model
    public String getModel()
    {
        return model;
    }
}

class Garage
{
    //instance variables declaration
    public ArrayList<Auto> autos;

    //constructor method
    public Garage()
    {
        autos = new ArrayList<>();
    }

    public int addAuto(String licensePlate, String model)
    {
        for (Auto auto : autos)
        {
            if(auto.getLicensePlate().compareToIgnoreCase(licensePlate) == 0)
            {
                //if the license plate already exists
                return -1;
            }
        }

        //adds an auto to the list
        autos.add(new Auto(licensePlate, model));
        return 0;
    }

    public void printAutoList()
    {
        if(autos.isEmpty())
        {
            System.out.println("Any auto has been added");
            return;
        }

        //prints auto data if the list is not empty
        System.out.println("AUTO LIST:");

        for (Auto auto : autos)
        {
            System.out.println("License plate: " + auto.getLicensePlate() + " - " + "model: " + auto.getModel());
        }
    }
}

public class EsercizioFinaleOggettiAutoOfficina
{
    public static void main(String[] args)
    {
        //variables declaration
        Scanner stringScanner = new Scanner(System.in);
        Garage autoGarage = new Garage();
        String autoInputAnswer = "s";

        //loops only if the answer is equal to "s"
        //or if the required answer is not valid
        while(autoInputAnswer.compareToIgnoreCase("s") == 0 ||
              autoInputAnswer.compareToIgnoreCase("n") != 0)
        {
            String carLicensePlate = "";
            String carModel = "";

            //auto data insert input
            System.out.println("Do you want to insert auto data in a garage?(s/n)");
            autoInputAnswer = stringScanner.nextLine();

            //if the answer is not valid
            if(autoInputAnswer.compareToIgnoreCase("s") != 0 &&
               autoInputAnswer.compareToIgnoreCase("n") != 0)
            {
                System.out.println("Insert a valid answer\n");
                continue;
            }

            //if the user wants to exit
            else if(autoInputAnswer.compareToIgnoreCase("n") == 0)
            {
                break;
            }

            //car license plate input
            System.out.println("Insert the car license plate");
            carLicensePlate = stringScanner.nextLine();
            
            //car model input
            System.out.println("Insert the car model");
            carModel = stringScanner.nextLine();

            //asks the user to insert the license plate again
            //if he inserted an already existing one
            while(autoGarage.addAuto(carLicensePlate, carModel) == -1)
            {
                //car license plate input
                System.out.println("The license plate inserted already exists.\nInsert a new license plate");
                carLicensePlate = stringScanner.nextLine();
            }
        }

        //prints the auto data list of the garage if at least 1 car has been inserted
        autoGarage.printAutoList();

        //close stringScanner usage
        stringScanner.close();
    }
}
