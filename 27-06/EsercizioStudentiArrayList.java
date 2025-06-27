import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class EsercizioStudentiArrayList
{
    public static void main(String[] args)
    {
        //variables declaration & init
        Scanner stringScanner = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        String insertedStudent = "";
        String studentToRemove = "";

        //insert student names input
        do
        {
            System.out.println("Insert a student name (dial \"end\" to print data)");
            insertedStudent = stringScanner.nextLine();

            if(!insertedStudent.toLowerCase().equals("end"))
            {
                studentNames.add(insertedStudent);
            }
        }
        while (!insertedStudent.toLowerCase().equals("end"));

        //sorts all student names
        Collections.sort(studentNames);

        //prints out student names count
        if(studentNames.size() == 1)
        {
            System.out.println("Here is the list of the " + studentNames.size() + " student name:");
        }

        else
        {
            System.out.println("Here is the list of the " + studentNames.size() + " student names:");
        }
        
        //prints out student names data
        for (String studentName : studentNames)
        {
            System.out.println(studentName);
        }

        //asks the user if he wants to remove some students from the list
        do
        {
            System.out.println("Insert the student name that you want to remove from the list (dial \"end\" to print updated data)");
            studentToRemove = stringScanner.nextLine();

            if(!studentToRemove.toLowerCase().equals("end"))
            {
                for (int i = studentNames.size() - 1; i >= 0; i--)
                {
                    if(studentToRemove.compareToIgnoreCase(studentNames.get(i)) == 0)
                    {
                        studentNames.remove(i);
                    }
                }
            }
        }
        while (!insertedStudent.toLowerCase().equals("end"));

        //closes stringScanner usage
        stringScanner.close();
    }
}
