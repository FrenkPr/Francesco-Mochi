public class VegBurger extends Hamburger
{
    //constructor method
    public VegBurger(String name)
    {
        super(name);
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing a VegBurger: whole wheat bread, vegetal burger, salad, tomatoes");
    }
}
