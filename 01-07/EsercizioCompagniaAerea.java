import java.util.ArrayList;
import java.util.Scanner;

class GlobalScanner
{
    private static Scanner numScanner = null;
    private static Scanner stringScanner = null;

    public static void InitScannerInputs()
    {
        numScanner = new Scanner(System.in);
        stringScanner = new Scanner(System.in);
    }

    public static int readIntInput()
    {
        return numScanner == null ? 0 : numScanner.nextInt();
    }

    public static String readStringInput()
    {
        return stringScanner == null ? "" : stringScanner.nextLine();
    }

    public static void CloseScannerInputs()
    {
        numScanner.close();
        stringScanner.close();
    }
}

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

    //add airplane to the fleet
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
        System.out.println("Insert the airplane model");
        airplaneNumSeats = GlobalScanner.readIntInput();

        //airplaneIdCode input
        System.out.println("Insert the airplane ID code");
        airplaneIdCode = GlobalScanner.readStringInput();

        //adding a new airplane to the fleet
        fleet.add(new Airplane(airplaneModel, airplaneNumSeats, airplaneIdCode));
        System.out.println("Airplane added successfully");
    }
}

public class EsercizioCompagniaAerea
{
    public static void main(String[] args)
    {
        //variables declaration & init
        

        int menuOption = 0;
        ArrayList<Student> students = new ArrayList<>();
        Student s = new Student("Pippo", 10);

        System.out.println("Welcome to the student software!\nHere are the current students already inserted in the system");

        s.printData();

        //alters the mark with valid and non valid marks
        s.setMark(11);
        s.setMark(8);
        s.setMark(-11);

        System.out.println(s.getName() + " updated mark: " + s.getMark());

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: add a student to the system");
            System.out.println("2: print the data of a student");
            System.out.println("3: search a student in the system");
            System.out.println("4: edit the mark of a student");
            System.out.println("0: exit");

            //menu input
            menuOption = numScanner.nextInt();

            switch(menuOption)
            {
                case 1:
                    s = null;
                    String studentName = "";
                    int studentMark = 0;

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //studentMark input
                    System.out.println("Insert student mark");
                    studentMark = numScanner.nextInt();

                    s = new Student(studentName, studentMark);
                    students.add(s);

                    System.out.println("Student " + s.getName() + " added successfully to the system");
                    break;

                case 2:
                    int studentIndex = 0;
                    studentName = "";

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student not found in the system");
                        break;
                    }

                    //prints student data if found in the system
                    students.get(studentIndex).printData();
                    break;
                
                case 3:
                    studentIndex = 0;
                    studentName = "";

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student " + studentName + " not found in the system");
                    }

                    else
                    {
                        //prints if the student has been found
                        System.out.println("Student " + students.get(studentIndex) + " found in the system");
                    }
                    break;

                case 4:
                    studentIndex = 0;
                    studentName = "";
                    studentMark = 0;

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student " + studentName + " not found in the system");
                        break;
                    }

                    //studentMark input
                    System.out.println("Insert new mark");
                    studentMark = numScanner.nextInt();
                    
                    students.get(studentIndex).setMark(studentMark);
                    break;

                //exit from the menu
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
