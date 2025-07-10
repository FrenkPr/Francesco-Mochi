import java.util.ArrayList;

class Airplane
{
    // private attributes
    private String model;
    private int numSeats;
    private String idCode;

    // constructor method
    public Airplane(String model, int numSeats, String idCode)
    {
        setModel(model);
        setNumSeats(numSeats);
        setIdCode(idCode);
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String newModel)
    {
        //if the new airplane model is empty
        while(newModel.isEmpty())
        {
            System.out.println("Insert a valid model");
            newModel = GlobalScanner.readStringInput();
        }

        model = newModel;
    }

    public int getNumSeats()
    {
        return numSeats;
    }

    public void setNumSeats(int newNumSeats)
    {
        //if the new airplane model is empty
        while(newNumSeats <= 0)
        {
            System.out.println("The number of seats must be at least 1.\nInsert a valid value");
            newNumSeats = GlobalScanner.readIntInput();
        }

        numSeats = newNumSeats;
    }

    public String getIdCode()
    {
        return idCode;
    }

    public void setIdCode(String newIdCode)
    {
        //if the new airplane model is empty
        while(newIdCode.isEmpty())
        {
            System.out.println("Insert a valid ID code");
            newIdCode = GlobalScanner.readStringInput();
        }

        idCode = newIdCode;
    }

    //prints out airplane data
    public void printData()
    {
        System.out.println("Airplane model: " + model + "\nnumber of seats: " + numSeats + "\nID code: " + idCode);
    }
}

class Pilot
{
    // private attributes
    private String name;
    private String numLicense;
    private int numFlightHours;

    // constructor method
    public Pilot(String name, String numLicense, int numFlightHours)
    {
        setName(name);
        setNumLicense(numLicense);
        setNumFlightHours(numFlightHours);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        //if the new airplane model is empty
        while(newName.isEmpty())
        {
            System.out.println("Insert a valid name");
            newName = GlobalScanner.readStringInput();
        }

        name = newName;
    }

    public String getNumLicense()
    {
        return numLicense;
    }

    public void setNumLicense(String newNumLicense)
    {
        //if the new airplane model is empty
        while(newNumLicense.isEmpty())
        {
            System.out.println("Insert a valid number of license");
            newNumLicense = GlobalScanner.readStringInput();
        }

        numLicense = newNumLicense;
    }

    public int getNumFlightHours()
    {
        return numFlightHours;
    }

    public void setNumFlightHours(int newNumHours)
    {
        //if the new airplane model is empty
        while(newNumHours <= 0)
        {
            System.out.println("The number of hours of flight must be at least 1 hour.\nInsert a valid value");
            newNumHours = GlobalScanner.readIntInput();
        }

        numFlightHours = newNumHours;
    }

    //prints out airplane data
    public void printData()
    {
        System.out.println("Pilot name: " + name + "\nnumber of license: " + numLicense + "\nNumber of hours of flight: " + numFlightHours);
    }
}

class Airline
{
    // private attributes
    private String name;
    private ArrayList<Airplane> fleet; //flotta
    private ArrayList<Pilot> pilots;

    // constructor method
    public Airline(String name)
    {
        this.name = name;
        fleet = new ArrayList<>();
        pilots = new ArrayList<>();
    }

    //adds an airplane to the fleet
    public void addAirplane()
    {
        //local variables init
        String airplaneModel = "";
        int airplaneNumSeats = 0;
        String airplaneIdCode = "";

        //airplaneModel input
        System.out.println("Insert the airplane model");
        airplaneModel = GlobalScanner.readStringInput();

        //airplaneNumSeats input
        System.out.println("Insert the number of seats");
        airplaneNumSeats = GlobalScanner.readIntInput();

        //airplaneIdCode input
        System.out.println("Insert the airplane ID code");
        airplaneIdCode = GlobalScanner.readStringInput();

        //adding a new airplane to the fleet
        fleet.add(new Airplane(airplaneModel, airplaneNumSeats, airplaneIdCode));
        System.out.println("Airplane added successfully");
    }

    //adds a pilot
    public void addPilot()
    {
        //local variables init
        String pilotName = "";
        String pilotNumLicense = "";
        int pilotNumFlightHours = 0;

        //airplaneModel input
        System.out.println("Insert the pilot name");
        pilotName = GlobalScanner.readStringInput();

        //airplaneNumSeats input
        System.out.println("Insert the pilot number of license");
        pilotNumLicense = GlobalScanner.readStringInput();

        //airplaneIdCode input
        System.out.println("Insert the total number of flight hours");
        pilotNumFlightHours = GlobalScanner.readIntInput();

        //adding a new pilot to the list
        pilots.add(new Pilot(pilotName, pilotNumLicense, pilotNumFlightHours));
        System.out.println("Pilot added successfully");
    }

    //print airline data
    public void printData()
    {
        System.out.println("Airline \"" + name + "\" data:\nAIRPLANES:");

        for (Airplane airplane : fleet)
        {
            airplane.printData();
        }

        System.out.println("\nPILOTS:");

        for (Pilot pilot : pilots)
        {
            pilot.printData();
        }
    }
}

public class EsercizioCompagniaAerea
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        Airline airline = null;
        String airlineName = "";

        //airlineName input
        System.out.println("Insert the name of an airline");
        airlineName = GlobalScanner.readStringInput();
        
        //if the input is not valid
        while(airlineName.isEmpty())
        {
            System.out.println("Insert a valid name of an airline");
            airlineName = GlobalScanner.readStringInput();
        }

        //creates a new airline
        airline = new Airline(airlineName);

        //adds airplanes to the airline
        airline.addAirplane();
        airline.addAirplane();
        airline.addAirplane();

        //adds pilots to the airline
        airline.addPilot();
        airline.addPilot();
        airline.addPilot();
        airline.addPilot();

        //prints out all airline data
        airline.printData();

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}
