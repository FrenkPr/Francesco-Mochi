import java.util.Scanner;

public class AskToManData
{
    public static void main(String[] args)
    {
        //variables initialization
		Scanner numScanner = new Scanner(System.in); //create a scanner object
		Scanner stringScanner = new Scanner(System.in); //create a scanner object
        int age = 0;
        boolean validTicket = false;
        boolean isWithAnAdult = false;
        boolean queueFreeOption = false;
        String vehicleOption = "";

        System.out.println("Is your ticket valid (true/false)?"); //input message
        validTicket = numScanner.nextBoolean(); //read user input

        //checks if the ticket is valid or not.
        //In case it's not, it will print out a message
        //saying the ticket is not valid and the application
        //will directly exit
        if(!validTicket)
        {
            System.out.println("Your ticket is not valid. Access denied");

            //close scanners usage
            numScanner.close();
            stringScanner.close();

            System.exit(-1);
        }

        System.out.println("Insert your age"); //input message
        age = numScanner.nextInt(); //read age input

        System.out.println("Are you with an adult (true/false)?"); //input message
        isWithAnAdult = numScanner.nextBoolean(); //read isWithAnAdult input

        System.out.println("Have you chosen the queue free option (true/false)?"); //input message
        queueFreeOption = numScanner.nextBoolean(); //read queueFreeOption input

        System.out.println("What kind of vehicle do you want to choose (taxi/bus)?"); //input message
        vehicleOption = stringScanner.nextLine(); //read vehicleOption input

        //close scanners usage
        numScanner.close();
        stringScanner.close();

        //prints out data summary
        System.out.println("DATA SUMMARY:");

        if(validTicket)
        {
            System.out.println("Your ticket is valid");
        }

        //checks if the age is a negative value. If so, the age value gets
        //changed to a positive value
        if(age < 0)
        {
            age = Math.abs(age);
            System.out.println("Age not valid. Changed the age to a positive value: " + age);
        }

        else
        {
            System.out.println("Age: " + age);
        }

        if(isWithAnAdult)
        {
            System.out.println("You're with an adult");
        }

        else
        {
            System.out.println("You're not with an adult");
        }

        if(queueFreeOption)
        {
            System.out.println("You have chosen the queue option");
        }

        else
        {
            System.out.println("You have not chosen the queue option");
        }

        //checks vehicle option validity
        if(!vehicleOption.toLowerCase().equals("taxi") && !vehicleOption.toLowerCase().equals("bus"))
        {
            vehicleOption = "bus";
            System.out.println("Vehicle not valid. I just chose the \"" + vehicleOption + "\" option for you");
        }

        else
        {
            System.out.println("Your vehicle option: " + vehicleOption + "\n");
        }
    }
}