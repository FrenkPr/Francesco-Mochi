public class EsercizioLogger
{
    public static void main(String[] args)
    {
        //declaring singleton variables
        Logger l1;
        Logger l2;

        //getting singleton instance (the instance will be the same)
        l1 = Logger.getInstance();
        l2 = Logger.getInstance();

        //printing log messages
        l1.log("Ciao!");
        l2.log("Ciauuuuuuuuuuuu!");

        //verifying that the instance is the same (true)
        //"==" and .equals are the same for objects
        if(l1 == l2)
        {
            System.out.println("Logger 1 and logger 2 are equals");
        }

        else
        {
            System.out.println("Logger 1 and logger 2 are different");
        }
    }
}
