import java.util.Scanner;

public class DoWhileEsempio
{
    public static void main(String[] args)
    {
        //variables init
        Scanner numInput = new Scanner(System.in);
        int num = 0;

        do
        {
            System.out.println("Insert any number (0 to exit)");
            num = numInput.nextInt();
        }
        while(num != 0);

        //closes scanner usage
        numInput.close();

        System.out.println("You dialed 0. Application ended successfully");
    }
}
