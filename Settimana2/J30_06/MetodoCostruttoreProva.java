public class MetodoCostruttoreProva
{
    String nome; //instance variable
    static int totaleStudente = 0; //static variable

    //constructor method
    MetodoCostruttoreProva(String nome)
    {
        this.nome = nome;
        totaleStudente++; //increments at each instance
    }
}
