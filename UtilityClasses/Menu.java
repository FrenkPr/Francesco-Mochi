public class Menu
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int menuOption = 0;

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: add a book to the library");
            System.out.println("2: print all available book data");
            System.out.println("3: search a book availability");
            System.out.println("4: borrow a book");
            System.out.println("5: return a book");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    break;

                //option 2
                case 2:
                    break;

                //option 3
                case 3:
                    break;

                //option 4
                case 4:
                    break;

                //option 5
                case 5:
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
