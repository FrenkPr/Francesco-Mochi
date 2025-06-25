public class ProvaCondizioni
{
    public static void main(String[] args)
    {
        //IF

        //print out a message only if the condition is true
        if (20 > 18)
        {
            System.out.println("20 is greater than 18");
        }

        //variable initialization
        int x = 20;
        int y = 18;

        //print out a message only if the condition is true
        if (x > y)
        {
            System.out.println("x is greater than y");
        }
        //IF

        //IF AND ELSE

        //variable initialization
        int time = 20;

        //print out a message only if the condition is true
        if (time < 18)
        {
            System.out.println("Good day.");
        }
        
        //print out another message if the recent condition was false
        else
        {
            System.out.println("Good evening."); // Outputs "Good evening."
        }
        //IF AND ELSE

        //IF, ELSE IF AND ELSE

        //variable initialization
        time = 22;

        //print out a message only if the condition is true
        if (time < 10)
        {
            System.out.println("Good morning.");
        }

        else if (time < 18)
        {
            System.out.println("Good day.");
        }

        else
        {
            System.out.println("Good evening."); // Outputs "Good evening."
        }

    }
}