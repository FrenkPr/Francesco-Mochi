class Persona
{
    // Campi privati (incapsulamento)
    private String nome;
    private int eta;

    // Costruttore pubblico
    public Persona(String nome, int eta) {
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
            System.out.println(this.nome + " è maggiorenne.");
        } else {
            System.out.println(this.nome + " non è maggiorenne.");
        }
    }
}

public class GetSetProva2
{
    public static void main(String[] args)
    {
        Person myObj = new Person();
        myObj.setName("Pippo"); // setting name value = "pippo"
        
        System.out.println(myObj.getName());
    }
}
