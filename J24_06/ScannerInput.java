import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in); //create a scanner object
        String userName = "";

        System.out.println("Insert username");

        userName = myObj.nextLine(); //read user input

        System.out.println("Hello dude! Here is your username: " + userName);

        myObj.close();
	}
}
