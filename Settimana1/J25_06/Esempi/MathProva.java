public class MathProva
{
    public static void main(String[] args)
    {
        System.out.println(Math.max(5, 10)); //prints out the max given number
        System.out.println(Math.min(5, 10)); //prints out the min given number
        System.out.println(Math.sqrt(64));
        System.out.printf("Sqrt as float: %.2f%n", Math.sqrt(64)); //prints out the 64 square root as float format, including only 2 floating digits
        System.out.printf("Sqrt as int: %d", (int)Math.sqrt(64)); //prints out the 64 square root as int format

        System.out.println(Math.abs(-100)); //prints out any given positive number
        System.out.println(Math.random()); //prints out a random number between 0.0 and 0.9 (1.0 excluded)

        int randomNum = (int)(Math.random() * 200); //gets a random number between 0 and 199 (200 excluded)
        System.out.println(randomNum); //prints out the random number
    }
}
