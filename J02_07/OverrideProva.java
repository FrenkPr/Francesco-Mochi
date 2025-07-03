class Veicolo
{
    // Creazione di una classe genitore. definire un metodo
    void run()
    {
        System.out.println("Il veicolo è in marcia");
    }
}

class Bike extends Veicolo
{
    void run()
    {
        System.out.println("La bici sta correndo in sicurezza");
    } // metodo della classe genitore
}

public class OverrideProva
{
    public static void main(String args[])
    {
        Bike obj = new Bike(); // crea oggetto
        obj.run();
    }
}
