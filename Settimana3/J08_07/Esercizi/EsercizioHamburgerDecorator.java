import java.util.ArrayList;

interface Hamburger
{
    public String getDescription();
    public double getPrice();
}

//base class
class BaseBurger implements Hamburger
{
    //declaring instance variables
    private String burgerDescription;
    private double burgerPrice;

    //constructor method
    public BaseBurger(String burgerDescription, double burgerPrice)
    {
        this.burgerDescription = burgerDescription;
        this.burgerPrice = burgerPrice;
    }

    public String getDescription()
    {
        return burgerDescription;
    }

    public void setPrice(double newPrice)
    {
        burgerPrice = newPrice;
    }

    public double getPrice()
    {
        return burgerPrice;
    }

    @Override
    public String toString()
    {
        return "Hamburger description: " + burgerDescription + " - price: "  + burgerPrice + "$";
    }
}

abstract class HamburgerDecorator implements Hamburger
{
    //declaring instance variables
    protected BaseBurger burger;

    //constructor method
    public HamburgerDecorator(BaseBurger burger)
    {
        this.burger = burger;
    }

    public String getDescription()
    {
        return burger.getDescription();
    }

    public double getPrice()
    {
        return burger.getPrice();
    }

    @Override
    public String toString()
    {
        return burger.toString();
    }
}

class CheeseDecorator extends HamburgerDecorator
{
    //constructor method
    public CheeseDecorator(BaseBurger burger)
    {
        super(burger);
        this.burger.setPrice(getPrice() + 0.5);
    }
}

class BaconDecorator extends HamburgerDecorator
{
    //constructor method
    public BaconDecorator(BaseBurger burger)
    {
        super(burger);
        this.burger.setPrice(getPrice() + 0.8);
    }
}

class HamburgerOrderCenterSingleton
{
    //declaring variables
    private static HamburgerOrderCenterSingleton instance; //private instance of the singleton class
    private ArrayList<Hamburger> orderedHamburgers;

    //private constructor to avoid direct instance
    private HamburgerOrderCenterSingleton()
    {
        orderedHamburgers = new ArrayList<>();
    }

    //adds an order to the list
    public void addOrder(Hamburger newHamburger)
    {
        orderedHamburgers.add(newHamburger);
    }

    //removes an order from the list
    public void removeOrder(Hamburger hamburgerToRemove)
    {
        orderedHamburgers.remove(hamburgerToRemove);
    }

    //prints out orders & clear them to the list
    public void printOrders()
    {
        for (Hamburger hamburger : orderedHamburgers)
        {
            System.out.println(hamburger);
        }

        System.out.println("\nOrders removed from the list");
        orderedHamburgers.clear();
    }

    // returns the unique instance of this class
    public static HamburgerOrderCenterSingleton getInstance()
    {
        // creates a unique instance if not existing
        if (instance == null)
        {
            instance = new HamburgerOrderCenterSingleton();
        }

        // returns the unique instance
        return instance;
    }
}

public class EsercizioHamburgerDecorator
{
    public static void main(String[] args)
    {
        //creates an unique instance (singleton)
        HamburgerOrderCenterSingleton hamburgerOrderStation = HamburgerOrderCenterSingleton.getInstance();

        //adds orders to the list
        hamburgerOrderStation.addOrder(new BaconDecorator(new BaseBurger("Hamburger with bacon (+0.80$)", 7.0)));
        hamburgerOrderStation.addOrder(new CheeseDecorator(new BaseBurger("Hamburger with cheese (+0.50$)", 5.0)));

        //prints out orders & removes them from the list
        hamburgerOrderStation.printOrders();
    }
}
