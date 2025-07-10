// defining singleton class

import java.util.ArrayList;

interface RunnableComponent
{
    public void init();
    public void load();
    public void run();
    public void notifyLastRanComponent(RunnableComponent c);
}

class Bios implements RunnableComponent
{
    public void init()
    {
        System.out.println("Initializing bios");
    }

    public void load()
    {
        System.out.println("Loading bios");
    }

    public void run()
    {
        System.out.println("Running bios");
    }

    public void notifyLastRanComponent(RunnableComponent c)
    {
        System.out.println("Last ran pc component: " + c.getClass().getSimpleName());
    }
}

class HardDisk implements RunnableComponent
{
    public void init()
    {
        System.out.println("Initializing hard disk");
    }

    public void load()
    {
        System.out.println("Loading hard disk");
    }

    public void run()
    {
        System.out.println("Running hard disk");
    }

    public void notifyLastRanComponent(RunnableComponent c)
    {
        System.out.println("Last ran pc component: " + c.getClass().getSimpleName());
    }
}

class OperatingSystem implements RunnableComponent
{
    public void init()
    {
        System.out.println("Initializing OS");
    }

    public void load()
    {
        System.out.println("Loading OS");
    }

    public void run()
    {
        System.out.println("Running OS");
    }

    public void notifyLastRanComponent(RunnableComponent c)
    {
        System.out.println("Last ran pc component: " + c.getClass().getSimpleName());
    }
}

class ComputerFacade
{
    private static ComputerFacade instance; //private instance of the singleton class
    private Bios pcBios;
    private HardDisk pcHardDisk;
    private OperatingSystem pcOperatingSystem;
    private ArrayList<RunnableComponent> pcComponents;

    //private constructor to avoid direct instance
    private ComputerFacade()
    {
        pcComponents = new ArrayList<>();

        pcBios = new Bios();
        pcHardDisk = new HardDisk();
        pcOperatingSystem = new OperatingSystem();

        addPcComponent(pcBios);
        addPcComponent(pcHardDisk);
        addPcComponent(pcOperatingSystem);
    }

    public void addPcComponent(RunnableComponent component)
    {
        pcComponents.add(component);
    }

    public void removePcComponent(RunnableComponent component)
    {
        pcComponents.remove(component);
    }

    //notifies all pc components about last ran component
    private void notifyPcComponents(RunnableComponent lastRanComponent)
    {
        for (RunnableComponent pcComponent : pcComponents)
        {
            pcComponent.notifyLastRanComponent(lastRanComponent);
        }
    }

    //executes a pc component that implements the runnable interface
    private void executePcComponent(RunnableComponent component)
    {
        component.init();
        component.load();
        component.run();

        component.notifyLastRanComponent(component);
        System.out.println();
    }

    //turns on the pc executing its components
    public void turnOnPc()
    {
        // executePcComponent(pcBios);
        // executePcComponent(pcHardDisk);
        // executePcComponent(pcOperatingSystem);

        for (RunnableComponent pcComponent : pcComponents)
        {
            executePcComponent(pcComponent);
        }
    }

    // returns the unique instance of this class
    public static ComputerFacade getInstance()
    {
        // creates a unique instance if not existing
        if (instance == null)
        {
            instance = new ComputerFacade();
        }

        // returns the unique instance
        return instance;
    }
}

public class EsComputerFacade
{
    public static void main(String[] args)
    {
        ComputerFacade pc = ComputerFacade.getInstance();

        pc.turnOnPc();
    }
}