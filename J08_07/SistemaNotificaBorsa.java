import java.util.ArrayList;

interface Investor
{
    public void investorNotify(String action, double value);
}

class PrivateInvestor implements Investor
{
    private String name;

    public PrivateInvestor(String name)
    {
        this.name = name;
    }

    public void investorNotify(String action, double value)
    {
        System.out.println(name + " private investor " + action + " action value: " + value);
    }
}

class BankInvestor implements Investor
{
    private String name;

    public BankInvestor(String name)
    {
        this.name = name;
    }

    public void investorNotify(String action, double value)
    {
        System.out.println(name + " bank investor " + action + " action value: " + value);
    }
}

//singleton class
class StockExchangeAgency
{
    //declaring instance & static variables
    private static StockExchangeAgency instance;
    private ArrayList<Investor> registeredInvestors;

    //constructor method
    private StockExchangeAgency()
    {
        registeredInvestors = new ArrayList<>();
    }

    // returns the unique instance of this class
    public static StockExchangeAgency getInstance()
    {
        // creates a unique instance if not created
        if (instance == null)
        {
            instance = new StockExchangeAgency();
        }

        // returns the unique instance
        return instance;
    }

    public void addInvestor(Investor i)
    {
        registeredInvestors.add(i);
    }

    public void removeInvestor(Investor i)
    {
        registeredInvestors.remove(i);
    }

    public void updateActionValue(String name, double value)
    {
        notifyInvestors(name, value);
    }

    private void notifyInvestors(String name, double value)
    {
        for (Investor investor : registeredInvestors)
        {
            investor.investorNotify(name, value);
        }
    }
}

public class SistemaNotificaBorsa
{
    public static void main(String[] args)
    {
        //creates a new stock exchange agency instance (singleton)
        StockExchangeAgency stockExchangeAgency = StockExchangeAgency.getInstance();

        //adds investors
        stockExchangeAgency.addInvestor(new PrivateInvestor("Caio"));
        stockExchangeAgency.addInvestor(new PrivateInvestor("Carlo"));
        stockExchangeAgency.addInvestor(new BankInvestor("Intesa San Paolo"));
        stockExchangeAgency.addInvestor(new BankInvestor("Monte dei Paschi"));

        //updates and notifies all investors about action values
        stockExchangeAgency.updateActionValue("Apple", 200.0);
        stockExchangeAgency.updateActionValue("Pear", 100.0);
    }
}