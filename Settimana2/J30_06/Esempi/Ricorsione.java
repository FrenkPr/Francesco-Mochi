public class Ricorsione
{
    //sequenza di Fibonacci
    private static int fattoriale(int n)
    {
        if (n == 1) return 1;
        
        return n * fattoriale(n - 1);
    }

    public static void main(String[] args)
    {
        System.out.println(fattoriale(7));
    }
}
