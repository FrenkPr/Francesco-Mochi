public class OverloadingProva
{
    public static void mostra(int numero)
    {
        System.out.println("Numero: " + numero);
    }

    public static void mostra(String testo)
    {
        System.out.println("Testo: " + testo);
    }

    public static void main(String[] args)
    {
        mostra(10); // Chiama mostra(int)
        mostra("Ciao"); // Chiama mostra(String)
    }
}
