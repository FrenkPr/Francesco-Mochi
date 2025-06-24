import java.util.Arrays;

public class StringTry
{
    public static void main(String[] args)
	{
        //variable initialization
		String text = "Hello";

        //prints the string length
		System.out.println(text + " text length: " + text.length());

        String firstName = "John";
        String lastName = "Doe";

		//string concatenations
        System.out.println("Hi " + firstName + " " + lastName);
        System.out.println("Hi ".concat(lastName) + " " + firstName.concat(" " + lastName));

		//special characters
        System.out.println("\nSpecial characters:\n" + '\'');
        System.out.println("\"");
        System.out.println("\\\n");

        System.out.println("AAAA\rBBBBB");
        System.out.println("AAAA\tBBBBB");
        System.out.println("Until \bDawn");
        System.out.println("AAAA\fBBBBB");

        //split
        String splitText = "Hello World";
        String[] words = splitText.split("\\s"); //"\\s" character means Space caracter

        System.out.println(Arrays.toString(words));
        System.out.println(words[0]);
        System.out.println(words[1]);

        //text length
        String codText = "Call of Duty";
        int textLength = codText.length();

        System.out.println("\"" + codText + "\"" + " text length: " + textLength);
        System.out.println("" + textLength);

        if(codText.toLowerCase().equals("call of duty"))
        {
            System.out.println("Yes, we're playing Call of Duty");
        }

        else
        {
            System.out.println("No, we're playing Dark Souls");
        }
	}
}
