public class EsercizioOverloading
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

    public static int computeFactorial(String numToString)
    {
        System.out.println("Insert a valid number");
        return -1;
    }

    public static void main(String[] args)
    {
        computeFactorial("5");
        System.out.println(computeFactorial(5));
        System.out.println(computeFactorial(7));
        System.out.println(computeFactorial(1));
        System.out.println(computeFactorial(0));
    }
}
