import java.util.Scanner;

public class LoginEsercizio
{
    public static void main(String[] args)
    {
        //variables init
        Scanner stringScanner = new Scanner(System.in); //create a scanner object

        String loginPassword = "";
        char accessConfirmPostLogin = '*';
        int numAttempts = 3;

        //login password input with message
        System.out.println("Insert the password to login");
        loginPassword = stringScanner.nextLine();

        //asks the user to login again if the password != "java123"
        //and numAttempts > 0
        while(!loginPassword.equals("java123") && numAttempts > 0)
        {
            System.out.println("Wrong password. Attempts left: " + numAttempts);
            numAttempts--;

            loginPassword = stringScanner.nextLine();
        }

        //checks if the password, on last attempt, has been dialed right or wrong.
        //In case of wrong, the app will exit and block the access
        if(numAttempts <= 0 && !loginPassword.equals("java123"))
        {
            System.out.println("Access blocked");
            System.exit(-1);
        }

        //prints out if signed in correctly
        System.out.println("Access granted");

        //asks the user to dial the 's' or 'n' character
        //till the character will be the asked one
        do
        {
            System.out.println("Do you want to proceed with system access (s/n)");
            accessConfirmPostLogin = stringScanner.nextLine().charAt(0);
        }
        while(accessConfirmPostLogin != 's' && accessConfirmPostLogin != 'n');

        //scanner input close
        stringScanner.close();

        //prints out if successfully accessed to the system
        if(accessConfirmPostLogin == 's')
        {
            System.out.println("Successfully accessed to the system");
        }

        //prints out if the access has been undoned
        else
        {
            System.out.println("Access undoned");
        }
    }
}
