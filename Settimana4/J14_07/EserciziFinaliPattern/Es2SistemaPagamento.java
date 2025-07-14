//uses facade pattern
class PaymentContainer
{
    //declaring instance variables
    private Paypal paypalPayment;
    private Crypto cryptoPayment;
    private Card cardPayment;

    //constructor method
    public PaymentContainer()
    {
        paypalPayment = PaymentFactory.createPaypal();
        cryptoPayment = PaymentFactory.createCrypto();
        cardPayment = PaymentFactory.createCard();
    }

    //main content of the application
    public void run()
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int menuOption = 0;

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: print paypal payment checkout");
            System.out.println("2: print crypto payment checkout");
            System.out.println("3: print card payment checkout");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput();
            System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    printPaypalPayment();
                    break;

                //option 2
                case 2:
                    printCryptoPayment();
                    break;

                //option 3
                case 3:
                    printCardPayment();
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

    //#region prints payment types info
    public void printPaypalPayment()
    {
        paypalPayment.printInfo();
    }

    public void printCryptoPayment()
    {
        cryptoPayment.printInfo();
    }

    public void printCardPayment()
    {
        cardPayment.printInfo();
    }
    //#endregion
}

//PaymentFactory generator
class PaymentFactory
{
    public static Paypal createPaypal()
    {
        return new Paypal();
    }

    public static Crypto createCrypto()
    {
        return new Crypto();
    }

    public static Card createCard()
    {
        return new Card();
    }
}

//#region checkout payment types
class Paypal
{
    public void printInfo()
    {
        System.out.println("Checkout completed via Paypal payment");
    }
}

class Crypto
{
    public void printInfo()
    {
        System.out.println("Checkout completed via Crypto payment");
    }
}

class Card
{
    public void printInfo()
    {
        System.out.println("Checkout completed via Card payment");
    }
}
//#endregion

public class Es2SistemaPagamento
{
    public static void main(String[] args)
    {
        //inits and run the application
        PaymentContainer p = new PaymentContainer();
        p.run();
    }
}