import java.util.ArrayList;

public class MenuEs1
{
    public static void initAndRun()
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int menuOption = 0;
        ArrayList<Veicolo> veicoli = new ArrayList<>();

        veicoli.add(new Veicolo("Veicolo generico", 2000));
        veicoli.add(new Auto("Fiat Punto", 2007));
        veicoli.add(new Moto("CRF-450", 1800));

        do
        {
            //menu description
            System.out.println("\nScegli quale operazione eseguire:");
            System.out.println("1: stampa i dati di un veicolo generico");
            System.out.println("2: stampa i dati dell'auto " + veicoli.get(1).getMarca());
            System.out.println("3: stampa i dati della moto " + veicoli.get(2).getMarca());
            System.out.println("0: esci");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    veicoli.get(0).dettagli();
                    break;

                //option 2
                case 2:
                    veicoli.get(1).dettagli();
                    break;

                //option 3
                case 3:
                    veicoli.get(2).dettagli();
                    break;

                //exit
                case 0:
                    break;

                //menu input not available
                default:
                    System.out.println("Inserire un'opzione valida");
                    break;
            }
        }
        while(menuOption != 0);

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}
