interface Message
{
    public String getContent();
}

//base class
class BaseMessage implements Message
{
    public String getContent()
    {
        return "Here is a base message";
    }
}

//composing a decorator message implementing the same interface,
//without altering the base class
class UpperCaseDecorator implements Message
{
    private Message baseMessage;

    public UpperCaseDecorator(Message baseMessage)
    {
        this.baseMessage = baseMessage;
    }

    public String getContent()
    {
        return baseMessage.getContent().toUpperCase();
    }
}

public class EsercizioMessaggioDecorator
{
    public static void main(String[] args)
    {
        //base class and decorator class
        //declaration & init
        Message m1 = new BaseMessage();
        Message m2 = new UpperCaseDecorator(m1);
        
        //printing class messages
        System.out.println(m1.getContent());
        System.out.println(m2.getContent());
    }
}
