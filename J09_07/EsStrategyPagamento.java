// PaymentMethod interface

import java.util.ArrayList;

interface PaymentMethod
{
    public void pay(double importValue);
    public String getCardType();
}

abstract class TransactionCard implements PaymentMethod
{
    //declaring instance variables
    private String cardType;

    //method constructor
    public TransactionCard(String cardType)
    {
        this.cardType = cardType;
    }

    public String getCardType()
    {
        return cardType;
    }

    public abstract void pay(double importValue);

    //Observer
    //notifies to all payment methods added
    //about which is the current used one
    public void notifyCurrentPaymentMethod()
    {
        //checks if payment methods have been added
        if(PaymentContext.getInstance().getPaymentMethodsCount() == 0)
        {
            System.out.println("No payment methods added yet");
            return;
        }

        //current payment should exist if it has been added at least one
        //payment method
        else if(PaymentContext.getCurrentPaymentMethod() == null)
        {
            System.out.println("[Notify: " + cardType + "] Notify error");
            return;
        }

        //notifies all payment methods about the current used one
        System.out.println("[Notify: " + cardType + "] Current payment method used: " + PaymentContext.getCurrentPaymentMethod().getCardType());
    }
}

// Concrete CreditCard strategy
class CreditCard extends TransactionCard
{
    //method constructor
    public CreditCard(String cardType)
    {
        super(cardType);
    }

    public void pay(double importValue)
    {
        System.out.println("Transaction $" + importValue + " executed successfully with credit card");
    }
}

// Concrete Paypal strategy
class Paypal extends TransactionCard
{
    //method constructor
    public Paypal(String cardType)
    {
        super(cardType);
    }

    public void pay(double importValue)
    {
        System.out.println("Transaction $" + importValue + " executed successfully with paypal");
    }
}

// Payment singleton context
class PaymentContext
{
    //declaring variables
    private static PaymentContext instance;
    private static PaymentMethod currentPaymentMethod;
    private ArrayList<PaymentMethod> paymentMethodsAdded;

    private PaymentContext()
    {
        paymentMethodsAdded = new ArrayList<>();
    }

    // returns the unique instance of this class
    public static PaymentContext getInstance()
    {
        // creates a unique instance if not existing
        if (instance == null)
        {
            instance = new PaymentContext();
        }

        // returns the unique instance
        return instance;
    }

    public static PaymentMethod getCurrentPaymentMethod()
    {
        return currentPaymentMethod;
    }

    public int getPaymentMethodsCount()
    {
        return paymentMethodsAdded.size();
    }

    //sets a strategy
    public void setPaymentMethod(PaymentMethod paymentType)
    {
        currentPaymentMethod = paymentType;
        paymentMethodsAdded.add(paymentType);
    }

    public void removePaymentMethod(PaymentMethod paymentType)
    {
        paymentMethodsAdded.remove(paymentType);

        if(currentPaymentMethod == paymentType)
        {
            currentPaymentMethod = null;
        }
    }

    public void executeTransaction(double totalImport)
    {
        currentPaymentMethod.pay(totalImport);

        for (PaymentMethod paymentMethod : paymentMethodsAdded)
        {
            if(paymentMethod instanceof TransactionCard)
            {
                ((TransactionCard)paymentMethod).notifyCurrentPaymentMethod();
            }
        }
    }
}

public class EsStrategyPagamento
{
    public static void main(String[] args)
    {
        // creates a payment context
        PaymentContext paymentCenter = PaymentContext.getInstance();

        paymentCenter.setPaymentMethod(new CreditCard("Credit card 1"));
        paymentCenter.executeTransaction(10.0); // Output: executes transaction result

        paymentCenter.setPaymentMethod(new Paypal("Paypal 1"));
        paymentCenter.executeTransaction(50.0); // Output: executes transaction result
    }
}