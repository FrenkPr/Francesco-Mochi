public class Cheeseburger extends Hamburger
{
    //constructor method
    public Cheeseburger(String name)
    {
        super(name);
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing a Cheeseburger: bread, meat, cheese, ketchup");
    }
}
