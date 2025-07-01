class Person
{
    private String name; // private attribute

    public String getName() // Getter method
    {
        return name;
    }

    public void setName(String newName) // Setter method
    {
        this.name = newName;
    }
}

public class GetSetProva
{
    public static void main(String[] args)
    {
        Person myObj = new Person();
        myObj.setName("Pippo"); // setting name value = "pippo"
        
        System.out.println(myObj.getName());
    }
}
