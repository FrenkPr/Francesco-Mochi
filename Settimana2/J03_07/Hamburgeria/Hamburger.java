public class Hamburger
{
    //instance variables declaration
    private String name;

    //constructor method
    public Hamburger(String name)
    {
        this.name = name;
    }

    //gets hamburger name
    public String getName()
    {
        return name;
    }

    public void prepare()
    {
        System.out.println("Sandwich preparation:\nadding the hamburger\nadding some tomatoes\nadding some salad");
    }
}
