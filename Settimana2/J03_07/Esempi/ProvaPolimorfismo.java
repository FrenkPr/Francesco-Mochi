import java.util.ArrayList;

public class ProvaPolimorfismo
{
    private static ArrayList <X> InsiemeX = new ArrayList<X>();

    private static void azionatore(X obj)
    {
        obj.azione();
    }

    public static void main(String[] args)
    {
        InsiemeX = new ArrayList<>();

        InsiemeX.add(new X());
        InsiemeX.add(new X1());
        InsiemeX.add(new X2());

        azionatore(InsiemeX.get(0));
        azionatore(InsiemeX.get(1));
        azionatore(InsiemeX.get(2));
    }
}

class X
{
    void azione()
    {
        System.out.println("azione generica");
    }
}

class X2 extends X
{
    void azione()
    {
        System.out.println("azione x2");
    }
}

class X1 extends X
{
    void azione()
    {
        System.out.println("azione x1");
    }
}