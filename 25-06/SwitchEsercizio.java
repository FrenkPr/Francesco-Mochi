import java.util.Scanner;

public class SwitchEsercizio
{
    public static void main(String[] args)
    {
        //variables initialization
		Scanner numScanner = new Scanner(System.in); //create a scanner object
		Scanner stringScanner = new Scanner(System.in); //create a scanner object
        final float BASE_INSURANCE_PRICE = 500.0f;
        float currentInsurancePrice = BASE_INSURANCE_PRICE;
        int driverAge = 0;
        int yearsOfDriveExperience = 0;
        int numAccidentsLast5Years = 0;
        String insurancePacketType = "";

        System.out.println("Insert driver age"); //input message
        driverAge = numScanner.nextInt(); //read age input

        //checks if the age is a negative value. If so, the age value gets
        //changed to a positive value
        if(driverAge < 0)
        {
            driverAge = Math.abs(driverAge);
        }

        //directly exit if the driver age is under 18
        if(driverAge < 18)
        {
            System.out.println("Not eligible for driving");
            System.exit(-1);
        }

        else if(driverAge >= 18 && driverAge <= 25)
        {
            //adds 20% of the base insurance price to it
            currentInsurancePrice += BASE_INSURANCE_PRICE * 0.2f;
        }

        else if(driverAge > 50)
        {
            //applies 10% off to the base insurance price
            currentInsurancePrice -= BASE_INSURANCE_PRICE * 0.1f;
        }
        //end driver age checks

        System.out.println("Insert the years of driving experience"); //input message
        yearsOfDriveExperience = numScanner.nextInt(); //read yearsOfDriveExperience input

        System.out.println("Insert the number of accidents in the last 5 years"); //input message
        numAccidentsLast5Years = numScanner.nextInt(); //read numAccidentsLast5Years input

        System.out.println("Insert the insurance packet (Base/Intermedium/Premium)"); //input message
        insurancePacketType = stringScanner.nextLine(); //read insurancePacketType input

        //close scanners usage
        numScanner.close();
        stringScanner.close();

        //checks if the yearsOfDriveExperience is a negative value. If so, the yearsOfDriveExperience value gets
        //changed to a positive value
        if(yearsOfDriveExperience < 0)
        {
            yearsOfDriveExperience = Math.abs(yearsOfDriveExperience);
        }

        if(yearsOfDriveExperience < 2)
        {
            //adds 30% of the base insurance price to it
            currentInsurancePrice += BASE_INSURANCE_PRICE * 0.3f;
        }

        //checks if the numAccidentsLast5Years is a negative value. If so, the numAccidentsLast5Years value gets
        //changed to a positive value
        if(numAccidentsLast5Years < 0)
        {
            numAccidentsLast5Years = Math.abs(numAccidentsLast5Years);
        }

        switch(numAccidentsLast5Years)
        {
            case 0:
                break;

            case 1:
                //adds 15% of the base insurance price to it
                currentInsurancePrice += BASE_INSURANCE_PRICE * 0.15f;
                break;

            case 2:
            case 3:
            case 4:
                //adds 15% of the base insurance price to it
                currentInsurancePrice += BASE_INSURANCE_PRICE * 0.3f;
                break;

            default:
                System.out.println("Not eligible for driving");
                System.exit(-1);
                break;
        }

        switch(insurancePacketType.toLowerCase())
        {
            case "intermedium":
                //adds 20% of the base insurance price to it
                currentInsurancePrice += BASE_INSURANCE_PRICE * 0.2f;
                break;

            case "premium":
                //adds 50% of the base insurance price to it
                currentInsurancePrice += BASE_INSURANCE_PRICE * 0.5f;
                break;

            default:
                break;
        }

        System.out.println("Your insurance price is: " + currentInsurancePrice);
    }
}
