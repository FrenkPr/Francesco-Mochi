import java.util.Scanner;

public class EsercizioArrayPasticceria
{
    public static void main(String[] args)
    {
        //variables declaration & init
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        String[] dessertNames;
        int[] dessertQuantities;
        int numDessertsPerType = 0;
        int totalNumOfDesserts = 0;
        
        //number of desserts input (max 10)
        System.out.println("Insert the number of desserts you want (max 10)");
        numDessertsPerType = numScanner.nextInt();

        while(numDessertsPerType < 0 || numDessertsPerType > 10)
        {
            System.out.println("Error: insert a number between 0 and 10");
            numDessertsPerType = numScanner.nextInt();
        }

        if(numDessertsPerType == 0)
        {
            System.out.println("Ok, bye!");

            //close scanners usage
            numScanner.close();
            stringScanner.close();

            System.exit(0);
        }

        //arrays init
        dessertNames = new String[numDessertsPerType];
        dessertQuantities = new int[numDessertsPerType];

        for (int i = 0; i < numDessertsPerType; i++)
        {
            //name of desserts input
            System.out.println("Insert the name of the dessert n." + i);
            dessertNames[i] = stringScanner.nextLine();

            //quantity of desserts input
            System.out.println("Insert the quantity of the dessert");
            dessertQuantities[i] = numScanner.nextInt();

            while (dessertQuantities[i] <= 0)
            {
                System.out.println("Error: insert a valid quantity");
                dessertQuantities[i] = numScanner.nextInt();
            }

            //stores the total quantiy of desserts
            totalNumOfDesserts += dessertQuantities[i];
        }

        //close scanners usage
        numScanner.close();
        stringScanner.close();

        //print summary message
        System.out.println("SUMMARY:\n");

        //prints out data
        for (int i = 0; i < numDessertsPerType; i++)
        {
            System.out.println("You ordered " + dessertQuantities[i] + " " + dessertNames[i]);
        }

        //prints total number of desserts
        System.out.println("\nTOTAL NUMBER OF DESSERTS:" + totalNumOfDesserts);
    }
}
