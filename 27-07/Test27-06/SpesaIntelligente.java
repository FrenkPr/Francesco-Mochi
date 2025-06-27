import java.util.Scanner;
import java.util.ArrayList;

/*
 Traccia: Lista della spesa intelligente  
 Usa un ArrayList<String> per memorizzare gli articoli della spesa 
 Chiede all’utente di inserire elementi finché non scrive "fine" 
 Dopo l’inserimento, stampa: 
 
 -Tutti gli elementi della lista (uno per riga) 
 
 -Il numero totale di elementi inseriti 
 
 -Se l’utente ha scritto sia "pane" e "latte" (usa .contains() e un if), stampa: "Hai pensato alla colazione!"
 */

public class SpesaIntelligente
{
    public static void main(String[] args)
    {
        //variables declaration & init
        Scanner stringScanner = new Scanner(System.in);

        ArrayList<String> productsPurchased = new ArrayList<>();
        String currentInsertedProduct = "";

        //products to purchase input
        do
        {
            //read input
            System.out.println("Inserire il nome dell'articolo da acquistare (digitare \"fine\" per stampare il risultato finale)");
            currentInsertedProduct = stringScanner.nextLine();

            //the "fine" input string won't be added to the list
            if(!currentInsertedProduct.toLowerCase().equals("fine") && !currentInsertedProduct.equals(""))
            {
                productsPurchased.add(currentInsertedProduct);
            }
        }
        while (!currentInsertedProduct.toLowerCase().equals("fine"));

        //closes stringScanner usage
        stringScanner.close();

        //output results
        System.out.println("\nEcco il riepilogo dei tuoi articoli:");

        //prints out product names data
        for (String product : productsPurchased)
        {
            System.out.println(product);
        }
        
        System.out.println("\nNUMERO TOTALE DEGLI ARTICOLI: " + productsPurchased.size());

        if(productsPurchased.contains("pane") && productsPurchased.contains("latte"))
        {
            System.out.println("\nHai pensato alla colazione!");
        }
    }
}
