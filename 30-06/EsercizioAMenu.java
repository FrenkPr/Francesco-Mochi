import java.util.Scanner;

class Es1Sum
{
    public static int sum(int num1, int num2)
    {
        return num1 + num2;
    }
}

class Es2Overloading
{
    public static int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    public static float multiply(float num1, float num2, float num3)
    {
        return num1 * num2 * num3;
    }
}

class Es3Recursion
{
    //Fibonacci's sequence
    public static int getFibonacciSequence(int n)
    {
        if(n < 0)
        {
            n = Math.abs(n);
        }

        if (n == 1) return 1;
        
        return n + getFibonacciSequence(n - 1);
    }
}

class Es4ValueAndReferenceType
{
    //value type
    public static void editValueType(int num)
    {
        num += 5;
        System.out.println("Value type num edited inside the method: " + num);
    }

    //reference type
    public static void editReferenceType(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] += 5;
        }

        for (int num : nums)
        {
            System.out.println("Reference type num edited inside the method: " + num);
        }
    }
}

public class EsercizioAMenu
{
    public static void main(String[] args)
    {
        Scanner numScanner = new Scanner(System.in);
        int menuOption = 0;

        do
        {
            //menu description
            System.out.println("Choose what operations you want to excute:");
            System.out.println("1: sum between 2 numbers");
            System.out.println("2: multiplication of numbers");
            System.out.println("3: Fibonacci's sequence");
            System.out.println("4: print value types and reference types");
            System.out.println("0: exit");

            //menu input
            menuOption = numScanner.nextInt();

            switch(menuOption)
            {
                case 1:
                    int num1 = 5;
                    int num2 = 7;

                    System.out.println("The sum between " + num1 + " and " + num2 + " is: " + Es1Sum.sum(num1, num2));
                    break;
                case 2:
                    num1 = 5;
                    num2 = 5;

                    float mulNum1 = 5.5f;
                    float mulNum2 = 7.6f;
                    float mulNum3 = 10.0f;

                    System.out.println("Here is the multiplication between 2 int numbers and 3 float numbers:");
                    System.out.println(num1 + " x " + num2 + " = " + Es2Overloading.multiply(num1, num2));
                    System.out.println(mulNum1 + " x " + mulNum2 + " x " + mulNum3 + " = " + Es2Overloading.multiply(mulNum1, mulNum2, mulNum3));
                    break;
                case 3:
                    System.out.println("Here is the Fibonacci's sequence of the number 5" + Es3Recursion.getFibonacciSequence(5));
                    break;
                case 4:
                    int numValueType = 10;
                    int[] refTypeNums = { 10, 20, 35, 33, 50 };

                    //value type
                    System.out.println("Value type num before method calling: " + numValueType);
                    Es4ValueAndReferenceType.editValueType(numValueType);
                    System.out.println("Value type num after method calling: " + numValueType);

                    for (int num : refTypeNums)
                    {
                        System.out.println("Ref type num before method editing: " + num);
                    }

                    //ref type
                    Es4ValueAndReferenceType.editReferenceType(refTypeNums);

                    for (int num : refTypeNums)
                    {
                        System.out.println("Ref type num after method editing: " + num);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Insert a valid option");
                    break;

            }
        }
        while(menuOption != 0);

        //closes numScanner usage
        numScanner.close();
    }
}