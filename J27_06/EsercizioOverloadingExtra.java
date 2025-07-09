import java.util.Scanner;

public class EsercizioOverloadingExtra
{
    public static int computeFactorial(int num)
    {
        if (num < 0)
        {
            System.out.println("Converted your number to a positive value to compute a correct factorial");
            num = Math.abs(num);
        }

        int factorialNum = 1;

        for (int i = factorialNum; i < num; i++)
        {
            factorialNum *= i + 1;
        }

        return factorialNum;
    }

    public static int getStringLength(String s)
    {
        return s == null ? 0 : s.length();
    }

    public static void main(String[] args)
    {
        //variables init & declaration
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int num = 0;
        String stringCount = "";

        System.out.println("Insert a positive number");
        num = numScanner.nextInt();

        System.out.println("Insert a string");
        stringCount = stringScanner.nextLine();

        System.out.println("Here is your factorial number: " + computeFactorial(num));
        System.out.println("Here is the number of characters of your string: " + getStringLength(stringCount));

        //close scanners usage
        numScanner.close();
        stringScanner.close();
    }
}
