class Person
{
    //instance variables declaration
    private String name;
    private String city;
    private static int age = 21;

    public Person(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    public void printData()
    {
        System.out.println("Name: " + name + "\nage: " + age + "\ncity: " + city + "\n");
    }
}

public class EsercizioPersona
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Francesco Mochi", "Rome");
        Person p2 = new Person("Osak", "Yeti city");
    
        p1.printData();
        p2.printData();
    }
}
