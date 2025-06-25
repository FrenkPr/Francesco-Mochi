import java.util.Scanner;

public class AtletaEsercizio
{
    public static void main(String[] args)
    {
        //variables initialization
		Scanner numScanner = new Scanner(System.in); //create a scanner object
        
        int athleteAge = 0;
        float bestTimeOn100Metres = 0.0f;
        float athleteWeight = 0.0f; //Kg
        float athleteHeight = 0.0f; //metres

        float bmi = 0.0f;

        System.out.println("Insert the athlete age"); //input message
        athleteAge = numScanner.nextInt(); //read athleteAge input

        System.out.println("Insert the best time ever on a 100 metres run"); //input message
        bestTimeOn100Metres = numScanner.nextFloat(); //read bestTimeOn100Metres input

        System.out.println("Insert the athlete weight"); //input message
        athleteWeight = numScanner.nextFloat(); //read athleteWeight input

        System.out.println("Insert the athlete height"); //input message
        athleteHeight = numScanner.nextFloat(); //read athleteHeight input

        //close scanners usage
        numScanner.close();

        //converts negative numbers to positive numbers in case of negative input
        athleteAge = Math.abs(athleteAge);
        bestTimeOn100Metres = Math.abs(bestTimeOn100Metres);
        athleteWeight = Math.abs(athleteWeight);
        athleteHeight = Math.abs(athleteHeight);

        bmi = athleteWeight / (float)Math.pow(athleteHeight, 2);

        if(athleteAge <= 18 && athleteAge >= 40 && bestTimeOn100Metres < 12.0f && bmi < 25.0f)
        {
            System.out.println("Admitted to the competition");
        }

        else
        {
            System.out.println("Not admitted to the competition");
        }
    }
}
