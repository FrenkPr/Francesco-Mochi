import java.util.Scanner;

public class ProvaFor
{
    public static void main(String[] args)
    {
        //numScanner input init
        Scanner numScanner = new Scanner(System.in);
        
        System.out.print("Insert a number: ");
        int numero = numScanner.nextInt(); //read number input

        //prints out the multiplication table of the chosen number
        System.out.println("multiplication table of " + numero + ":");

        //for loop to iterate and multiply the chosen number from 1 to 10
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        //close numScanner usage
        numScanner.close();
    }
}
