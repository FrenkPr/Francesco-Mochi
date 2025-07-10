public class Teacher extends Person implements Registrable
{
    //declaring instance variables
    private String subject;

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public void roleDescription()
    {
        System.out.println(getName() + ": I'm a teacher of " + subject);
    }

    public void registration()
    {
        System.out.println("Registered via the teaching secretariat");
    }
}
