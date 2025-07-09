import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    // private attributes
    private String name;
    private int mark;
    private static int idStudentsCount = 0;

    // constructor method
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;

        idStudentsCount++;
        System.out.println("Added " + idStudentsCount + " student/s");
    }

    public String getName()
    {
        return name;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int newMark)
    {
        if(newMark < 0 || newMark > 10)
        {
            System.out.println(newMark + " is not a valid mark.\nInsert a vote between 0 and 10");
            return;
        }

        mark = newMark;
    }

    public static int searchStudent(ArrayList<Student> students, String name)
    {
        for (int i = 0; i < students.size(); i++)
        {
            //if the student has been found in the list
            if(students.get(i).getName().compareToIgnoreCase(name) == 0)
            {
                return i;
            }
        }

        return -1;
    }

    public void printData()
    {
        System.out.println("Student name: " + name + "\nVote: " + mark);
    }
}

public class EsercizioIncapsulamentoStudenti
{
    public static void main(String[] args)
    {
        //variables declaration & init
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int menuOption = 0;
        ArrayList<Student> students = new ArrayList<>();
        Student s = new Student("Pippo", 10);

        System.out.println("Welcome to the student software!\nHere are the current students already inserted in the system");

        s.printData();

        //alters the mark with valid and non valid marks
        s.setMark(11);
        s.setMark(8);
        s.setMark(-11);

        System.out.println(s.getName() + " updated mark: " + s.getMark());

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: add a student to the system");
            System.out.println("2: print the data of a student");
            System.out.println("3: search a student in the system");
            System.out.println("4: edit the mark of a student");
            System.out.println("0: exit");

            //menu input
            menuOption = numScanner.nextInt();

            switch(menuOption)
            {
                case 1:
                    s = null;
                    String studentName = "";
                    int studentMark = 0;

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //studentMark input
                    System.out.println("Insert student mark");
                    studentMark = numScanner.nextInt();

                    s = new Student(studentName, studentMark);
                    students.add(s);

                    System.out.println("Student " + s.getName() + " added successfully to the system");
                    break;

                case 2:
                    int studentIndex = 0;
                    studentName = "";

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student not found in the system");
                        break;
                    }

                    //prints student data if found in the system
                    students.get(studentIndex).printData();
                    break;
                
                case 3:
                    studentIndex = 0;
                    studentName = "";

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student " + studentName + " not found in the system");
                    }

                    else
                    {
                        //prints if the student has been found
                        System.out.println("Student " + students.get(studentIndex) + " found in the system");
                    }
                    break;

                case 4:
                    studentIndex = 0;
                    studentName = "";
                    studentMark = 0;

                    //studentName input
                    System.out.println("Insert student name");
                    studentName = stringScanner.nextLine();

                    //searches for the student in the given list
                    studentIndex = Student.searchStudent(students, studentName);
                    
                    //if student not found, exits from the switch
                    //and turns back to the menu
                    if(studentIndex == -1)
                    {
                        System.out.println("Student " + studentName + " not found in the system");
                        break;
                    }

                    //studentMark input
                    System.out.println("Insert new mark");
                    studentMark = numScanner.nextInt();
                    
                    students.get(studentIndex).setMark(studentMark);
                    break;

                //exit from the menu
                case 0:
                    break;

                default:
                    System.out.println("Insert a valid option");
                    break;

            }
        }
        while(menuOption != 0);

        //closes scanners usage
        numScanner.close();
        stringScanner.close();
    }
}
