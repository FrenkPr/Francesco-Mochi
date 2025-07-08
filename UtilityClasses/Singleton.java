// Definizione della classe Singleton
public class Singleton
{
    private static Singleton instance; //private instance of the singleton class

    //private constructor to avoid direct instance
    private Singleton()
    {

    }

    // returns the unique instance of this class
    public static Singleton getInstance()
    {
        // creates a unique instance if not existing
        if (instance == null)
        {
            instance = new Singleton();
        }

        // returns the unique instance
        return instance;
    }

    // Metodo di esempio che può essere chiamato sull'istanza Singleton
    public void DoSomething()
    {
        System.out.println("Singleton: DoSomething() called");
    }
}