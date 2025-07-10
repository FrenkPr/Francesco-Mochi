/*
    Esercizio 2: Incapsulamento e metodi
    Traccia: 
    Crea una classe ContoBancario con gli attributi privati numeroConto, saldo e titolare.
    Implementa i metodi pubblici getNumeroConto(), getSaldo(), getTitolare(), deposita(double importo) e preleva(double importo) per accedere e modificare i dati del conto.
    Crea un programma principale che istanzia un oggetto ContoBancario, deposita e preleva fondi, e stampa il saldo finale.
 */


//Implementa i metodi pubblici getNumeroConto(), getSaldo(), getTitolare(), deposita(double importo)
//e preleva(double importo) per accedere e modificare i dati del conto.
class BankAccount
{
    private int numAccount;
    private float balance;
    private String owner;

    public BankAccount(int numAccount, float balance, String owner)
    {
        this.numAccount = numAccount;
        this.balance = balance;
        this.owner = owner;
    }

    public int getAccountNumber()
    {
        return numAccount;
    }

    public float getBalance()
    {
        return balance;
    }

    public String getOwner()
    {
        return owner;
    }
}

public class ContoBancarioMain
{
    public static void main(String[] args)
    {
        
    }
}
