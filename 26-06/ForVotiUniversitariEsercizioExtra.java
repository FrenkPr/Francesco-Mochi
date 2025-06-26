import java.util.Scanner;

public class ForVotiUniversitariEsercizioExtra
{
    public static void main(String[] args)
    {
        //variables init
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        String insertStudentVotesAnswer = "";
        String studentName = "";
        int numOfVotes = 0;
        int currentVoteValue = 0;
        float voteValueAvg = 0.0f;
        
        while(true)
        {
            //number of votes input
            System.out.println("Do you want to insert the data of a student? (s/n)");
            insertStudentVotesAnswer = stringScanner.nextLine();

            if(!insertStudentVotesAnswer.equals("s") && !insertStudentVotesAnswer.equals("n"))
            {
                continue;
            }

            else if(insertStudentVotesAnswer.equals("n"))
            {
                break;
            }

            //studentName input
            System.out.println("Insert the name of the student");
            studentName = stringScanner.nextLine();
    
            //number of votes input
            System.out.println("Insert the number of votes you want to assign to the student");
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
    
            if(numOfVotes > 0)
            {
                //divides the number of votes to the average
                voteValueAvg /= numOfVotes;

                System.out.println("The average of the student " + studentName + " is: " + voteValueAvg);

                //reset the value in case of the insert of another student
                voteValueAvg = 0.0f;
            }
    
            else
            {
                System.out.println("The student " + studentName + " has no votes\n");
            }
        }

        //close numScanner usage
        numScanner.close();
        stringScanner.close();
    }
}
