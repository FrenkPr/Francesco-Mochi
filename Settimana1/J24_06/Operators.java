public class Operators
{
    public static void main(String[] args)
	{
        //variable initialization
        int x = 10;

        //sum operation
        x += 5;

        //sub operation
        x -= 100;

        //mul operation
        x *= 2;

        //div operation
        x /= 4;

        //module operation
        x %= 2;

        //increment by 1 operator
        x++;
        x++;

        //decrement by 1 operator
        x--;

        System.out.println(x); //result value
        System.out.println(x > 0); //condition result value: true/false

        System.out.println(x >= -50 && x <= 100); //condition result value: true/false
        System.out.println(x <= -50 || x >= 100); //condition result value: true/false
        System.out.println(!(x >= -50 && x <= 100)); //condition result value: true/false
    }
}
