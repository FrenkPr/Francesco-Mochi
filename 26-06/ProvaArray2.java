import java.util.Scanner;;

public class ProvaArray2
{
    public static void main(String[] args)
    {
        //variables init
        Scanner numScanner = new Scanner(System.in);
        int[] nums = new int[5];

        //insert array numbers
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print("Insert a number: ");
            nums[i] = numScanner.nextInt();
        }

        System.out.println("Here are your numbers:");

        //prints out array numbers
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        //close numScanner usage
        numScanner.close();
    }
}
