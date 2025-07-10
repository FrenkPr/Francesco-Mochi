interface EuropeanSocket
{
    public void giveElectricity();
}

class AmericanSocket
{
    public void provideElectricity()
    {
        System.out.println("I'm providing American electricity");
    }
}

class SocketAdapter implements EuropeanSocket
{
    public void provideElectricity()
    {
        
    }

    public void giveElectricity()
    {

    }
}

public class EsSocketAdapter
{
    
}
