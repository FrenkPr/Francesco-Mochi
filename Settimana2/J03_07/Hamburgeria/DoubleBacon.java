public class DoubleBacon extends Hamburger
{
    //constructor method
    public DoubleBacon(String name)
    {
        super(name);
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing a DoubleBacon: bread, double meat, bacon, cheddar, maionese");
    }
}
