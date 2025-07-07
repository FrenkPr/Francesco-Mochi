public abstract class Person
{
    //declaring instance variables
    private String name;
    private int age;

    //constructor method
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        //won't change the name in case of invalid name
        if(newName.isEmpty())
        {
            System.out.println("Student name can't be empty");
            return;
        }

        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        //won't change the age in case of invalid name
        if(newAge < 6)
        {
            System.out.println("The student age must be at least 6 years old");
            return;
        }

        age = newAge;
    }

    public abstract void roleDescription();
}
