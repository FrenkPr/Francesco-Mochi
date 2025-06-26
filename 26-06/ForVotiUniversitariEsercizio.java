import java.util.Scanner;

public class ForVotiUniversitariEsercizio
{
    public static void main(String[] args)
    {
        //variables init
        Scanner numScanner = new Scanner(System.in);
        int numOfVotes = 0;
        int currentVoteValue = 0;
        float voteValueAvg = 0.0f;
        
        //number of votes input
        System.out.println("Insert the number of votes you want to choose");
        numOfVotes = numScanner.nextInt();

        //till it's positive
        while(numOfVotes < 0)
        {
            //number of votes input
            System.out.println("Error: insert a positive value");
            numOfVotes = numScanner.nextInt();
        }

        for(int i = 0; i < numOfVotes; i++)
        {
            //number of votes input
            System.out.println("Insert a vote between 0 and 30");
            currentVoteValue = numScanner.nextInt();

            //till it's out of range
            while(currentVoteValue < 0 || currentVoteValue > 30)
            {
                //number of votes input
                System.out.println("Error: insert a vote between 0 and 30");
                currentVoteValue = numScanner.nextInt();
            }

            //checks the vote value and prints out a message based on it
            if(currentVoteValue >= 18 && currentVoteValue < 24)
            {
                System.out.println("Sufficient");
            }

            else if(currentVoteValue >= 24)
            {
                System.out.println("Good, very good");
            }

            else
            {
                System.out.println("Insufficient");
            }

            //sum votes to the average
            voteValueAvg += currentVoteValue;
        }

        //divides the number of votes to the average
        voteValueAvg /= numOfVotes;

        System.out.println("The average of the votes is: " + voteValueAvg);

        //close numScanner usage
        numScanner.close();
    }
}
