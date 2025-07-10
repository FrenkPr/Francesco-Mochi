class Person
{
    // Campi privati (incapsulamento)
    private String nome;
    private int eta;

    // Costruttore pubblico
    public Person(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodo privato utilizzato dalla classe
    private boolean verificaMaggiorenne() {
        return this.eta >= 18;
    }

    // Metodo pubblico che fa uso del metodo privato
    public void stampaStatus() {
        if (verificaMaggiorenne()) {
            System.out.println(this.nome + " e' maggiorenne.");
        } else {
            System.out.println(this.nome + " non e' maggiorenne.");
        }
    }
}

public class GetSetProva2
{
    public static void main(String[] args)
    {
        Person myObj = new Person("Lillo", 23);
        myObj.stampaStatus();
    }
}
