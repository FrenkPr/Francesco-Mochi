import java.util.ArrayList;

public class SpatialStation
{
    private ArrayList<String> experiments;
    private ArrayList<Integer> valuation;

    public SpatialStation()
    {
        this.experiments = new ArrayList<>();
        this.valuation = new ArrayList<>();
    }

    public void addExperiment(Spaceman roleType, int numExperiment, String experimentName)
    {
        if(!(roleType instanceof Scientist))
        {
            System.out.println("Access denied");
            return;
        }

        if(numExperiment)

        experiments[numExperiment] = experimentName;
    }

    public void addValuation(Spaceman roleType, int numExperiment, int valuation)
    {
        if(!(roleType instanceof Ispector))
        {
            System.out.println("Access denied");
            return;
        }

        //if the experiment doesn't exist
        if(experiments[numExperiment].equals("N/A"))
        {
            System.out.println("The experiment n." + numExperiment + " must exist to be valuated");
            return;
        }

        //if the valuation value is not correct
        while(valuation <= 0 || valuation > 5)
        {
            System.out.println("Insert a valuation between 1 and 5");
            valuation = GlobalScanner.readIntInput();
        }

        //adding a valuation
        this.valuation[numExperiment] = valuation;
    }

    public void printExperiments(Spaceman roleType)
    {
        if(!(roleType instanceof ChiefScientist))
        {
            System.out.println("Access denied");
            return;
        }

        for (int i = 0; i < experiments.length; i++)
        {
            System.out.println("Experiment n." + (i+1) + ": " + experiments[i]);
        }
    }

    public void printExperimentValuations(Spaceman roleType)
    {
        if(!(roleType instanceof ChiefScientist))
        {
            System.out.println("Access denied");
            return;
        }

        for (int i = 0; i < valuation.length; i++)
        {
            System.out.println("Experiment n." + (i+1) + ": " + valuation[i]);
        }
    }
}