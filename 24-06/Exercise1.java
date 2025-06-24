import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
	{
        //variables initialization
		Scanner myObj = new Scanner(System.in); //create a scanner object
        String inStr = "";
        int inNum = 0;
        float inFloatNum = 0.0f;
        double inDoubleNum = 0.0d;
        boolean inBoolNum = false;

        //input message
        System.out.println("Insert a string");

        //read user input
        inStr = myObj.nextLine();


        //input message
        System.out.println("Insert an int num");

        //read user input
        inNum = myObj.nextInt();


        //input message
        System.out.println("Insert a float num");

        //read user input
        inFloatNum = myObj.nextFloat();


        //input message
        System.out.println("Insert a double num");

        //read user input
        inDoubleNum = myObj.nextDouble();


        //input message
        System.out.println("Insert a bool value (true/false)");

        //read user input
        inBoolNum = myObj.nextBoolean();

        //output messages
        System.out.println("\nString value: " + inStr);
        System.out.println("Int value: " + inNum);
        System.out.println("Float value: " + inFloatNum);
        System.out.println("Double value: " + inDoubleNum);
        System.out.println("Boolean value: " + inBoolNum);

        //close scanner usage
        myObj.close();

        //output casting messages
        System.out.println("\nInt to double value: " + (double)inNum);
        System.out.println("Double to int value: " + (int)inDoubleNum);
	}
}
