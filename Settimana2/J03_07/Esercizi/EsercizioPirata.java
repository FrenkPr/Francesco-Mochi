class Person
{
    protected String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        System.out.println("Hello! I'm " + name + ", a person!");
    }
}

class Pirate extends Person
{
    public Pirate(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("Hello! I'm " + name + ", a pirate!");
    }
}

public class EsercizioPirata
{
    public static void main(String[] args)
    {
        Person genericPerson = new Person("Frenk");
        genericPerson.sayHello();

        genericPerson = new Pirate("Freeeeenk");
        genericPerson.sayHello();
    }
}
