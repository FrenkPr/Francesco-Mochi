// Operation interface
interface Operation
{
    public int execute(int a, int b);
}

// Concrete sum strategy
class SumStrategy implements Operation
{
    public int execute(int a, int b)
    {
        return a + b;
    }
}

// Concrete mul strategy
class MulStrategy implements Operation
{
    public int execute(int a, int b)
    {
        return a * b;
    }
}

// Context
class Calculator
{
    private Operation mathOperation;

    //sets a strategy
    public void setOperationType(Operation mathOperation)
    {
        this.mathOperation = mathOperation;
    }

    public void executeOperation(int num1, int num2)
    {
        System.out.println(mathOperation.execute(num1, num2));
    }
}

public class EsercizioStrategyOperazioniMatematiche
{
    public static void main(String[] args)
    {
        // creates math calculator context
        Calculator calculator = new Calculator();

        calculator.setOperationType(new SumStrategy());
        calculator.executeOperation(10, 20); // Output: executes sum operation

        calculator.setOperationType(new MulStrategy());
        calculator.executeOperation(20, 20); // Output: executes mul operation
    }
}