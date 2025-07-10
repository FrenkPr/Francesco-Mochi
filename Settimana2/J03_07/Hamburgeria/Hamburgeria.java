import java.util.ArrayList;

public class Hamburgeria
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int menuOption = 0;
        ArrayList<Hamburger> hambrugersOrdered = new ArrayList<>();

        do
        {
            //menu description
            System.out.println("\nWelcome to the burger station!");
            System.out.println("Choose which operations you want to excute:");
            System.out.println("1: add a Hamburger to the order");
            System.out.println("2: prepare all the Hamburgers ordered");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    String hamburgerName = "";
                    
                    System.out.println("Insert the Hamburger name (Cheeseburger, VegBurger, Double Bacon)");
                    hamburgerName = GlobalScanner.readStringInput();

                    while(!hamburgerName.equalsIgnoreCase("Cheeseburger") &&
                          !hamburgerName.equalsIgnoreCase("VegBurger") &&
                          !hamburgerName.equalsIgnoreCase("Double Bacon"))
                    {
                        System.out.println("Insert the name of a Hamburger included in the menu (Cheeseburger, VegBurger, Double Bacon)");
                        hamburgerName = GlobalScanner.readStringInput();
                    }
                    
                    //creates a specific type of burger instance based on the hamburger name
                    switch(hamburgerName.toLowerCase())
                    {
                        case "cheeseburger":
                            hambrugersOrdered.add(new Cheeseburger(hamburgerName));
                            break;

                        case "vegburger":
                            hambrugersOrdered.add(new VegBurger(hamburgerName));
                            break;

                        case "double bacon":
                            hambrugersOrdered.add(new DoubleBacon(hamburgerName));
                            break;
                    }

                    System.out.println(hamburgerName + " added to the orders successfully");

                    break;

                //option 2
                case 2:
                    //if there are no orders
                    if(hambrugersOrdered.isEmpty())
                    {
                        System.out.println("No Hamburgers added to the order");
                    }

                    //prepares ordered hamburgers
                    for (Hamburger hamburger : hambrugersOrdered)
                    {
                        hamburger.prepare();
                    }

                    //clears the list of the hamburgers prepared
                    hambrugersOrdered.clear();
                    break;

                //exit
                case 0:
                    break;

                //menu input not available
                default:
                    System.out.println("Insert a valid option");
                    break;
            }
        }
        while(menuOption != 0);

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
    
}
