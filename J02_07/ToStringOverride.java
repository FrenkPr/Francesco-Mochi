class Student
{
    //attributes declaration
    private String name;
    private int age;

    //constructor method
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //explicit override
    @Override
    public String toString()
    {
        return "Student name: " + name + "\nage: " + age;
    }
}

public class ToStringOverride
{
    public static void main(String args[])
    {
        //student variable declaration & init
        Student student = new Student("Scott Pilgrim", 22);
        
        System.out.println(student); //calling the toString method implicitly
    }
}
