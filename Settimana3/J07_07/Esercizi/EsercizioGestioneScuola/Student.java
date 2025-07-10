public class Student extends Person implements Registrable
{
    //declaring instance variables
    private String attendingClass;

    public Student(String name, int age, String attendingClass)
    {
        super(name, age);
        this.attendingClass = attendingClass;
    }

    public void roleDescription()
    {
        System.out.println(getName() + ": I'm a student of the " + attendingClass + " class");
    }

    public void registration()
    {
        System.out.println("Registered via the online module");
    }
}
