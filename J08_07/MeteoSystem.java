import java.util.ArrayList;

interface Display
{
    public void update(float temperature);
    public void printNotify();
}

class DisplayConsole implements Display
{
    //declaring instance variables
    protected float temperature;

    //constructor method
    public DisplayConsole(float temperature)
    {
        this.temperature = temperature;
    }

    public void update(float temperature)
    {
        this.temperature = temperature;
    }

    public void printNotify()
    {
        System.out.println("Display console current temperature: " + temperature);
    }
}

class DisplayMobile extends DisplayConsole
{
    //constructor method
    public DisplayMobile(float temperature)
    {
        super(temperature);
    }

    @Override
    public void printNotify()
    {
        System.out.println("Display mobile current temperature: " + temperature);
    }
}

class MeteoStation
{
    //declaring instance variables
    ArrayList<Display> registeredDisplays;

    //constructor method
    public MeteoStation()
    {
        registeredDisplays = new ArrayList<>();
    }

    public void addDisplay(Display d)
    {
        registeredDisplays.add(d);
    }

    public void removeDisplay(Display d)
    {
        registeredDisplays.remove(d);
    }

    public void setTemperature(float t)
    {
        for (Display display : registeredDisplays)
        {
            display.update(t);
        }

        notifyDisplays();
    }

    public void notifyDisplays()
    {
        for (Display display : registeredDisplays)
        {
            display.printNotify();
        }
    }
}

public class MeteoSystem
{
    public static void main(String[] args)
    {
        MeteoStation meteoStation = new MeteoStation();

        
        meteoStation.addDisplay(new DisplayConsole(-100.0f));
        meteoStation.addDisplay(new DisplayConsole(-50.0f));
        meteoStation.addDisplay(new DisplayMobile(20.0f));
        meteoStation.addDisplay(new DisplayMobile(30.0f));

        //updates and displays the temperature to every display
        meteoStation.setTemperature(10.0f);
    }
}
