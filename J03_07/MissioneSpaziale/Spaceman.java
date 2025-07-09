public class Spaceman
{
    //attributes declaration
    private String name;
    private String email;
    private float oxygenLeft;
    protected static SpatialStation spatialStation;

    public Spaceman(String name, String email)
    {
        this.name = name;
        this.email = email;
        generateRandomOxygenLeft();
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public float getOxygenLeft()
    {
        return oxygenLeft;
    }

    public void generateRandomOxygenLeft()
    {
        oxygenLeft = (float)(Math.random() * 100.0f) + 1.0f;
    }
}