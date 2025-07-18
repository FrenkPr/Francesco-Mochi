/*
 Esercizio 1 – Le Tre Regole Fondamentali dell’OOP 
Obiettivo: Applicare incapsulamento, ereditarietà e polimorfismo
Progetta un semplice sistema per la gestione di veicoli. Crea una classe base Veicolo che contenga almeno due attributi (es. marca, anno) e un metodo dettagli().
 Applica l'incapsulamento rendendo gli attributi privati e usando getter/setter. 
 Crea due sottoclassi: Auto e Moto, che ereditano da Veicolo. 
 Sovrascrivi il metodo dettagli() nelle sottoclassi per polimorfismo.
 Infine, nel main, crea un arraylist di Veicolo e stampa i dettagli di ogni elemento.
Gestisci il tutto tramite menu
 */

class Moto extends Veicolo
{
    //metodo costruttore
    public Moto(String marca, int anno)
    {
        //richiama il metodo costruttore padre
        super(marca, anno);
    }

    //override del moetodo dettagli
    @Override
    public void dettagli()
    {
        System.out.println("Dettagli moto:");
        super.dettagli();
    }
}

class Auto extends Veicolo
{
    //metodo costruttore
    public Auto(String marca, int anno)
    {
        //richiama il metodo costruttore padre
        super(marca, anno);
    }

    //override del moetodo dettagli
    @Override
    public void dettagli()
    {
        System.out.println("Dettagli auto:");
        super.dettagli();
    }
}


class Veicolo
{
    //dichiarazione variabili d'istanza
    private String marca;
    private int anno;

    //metodo costruttore
    public Veicolo(String marca, int anno)
    {
        this.marca = marca;
        this.anno = anno;
    }

    //setta la marca a un nuovo valore
    public void setMarca(String nuovaMarca)
    {
        marca = nuovaMarca;
    }

    //restituisce la marca
    public String getMarca()
    {
        return marca;
    }

    //setta la marca a un nuovo valore
    public void setAnno(int nuovoAnno)
    {
        anno = nuovoAnno;
    }

    //restituisce la marca
    public int getAnno()
    {
        return anno;
    }

    //metodo che stampa i dettagli del veicolo
    public void dettagli()
    {
        System.out.println("Marca: " + marca + "\nAnno: " + anno);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        MenuEs1.initAndRun();
    }
}