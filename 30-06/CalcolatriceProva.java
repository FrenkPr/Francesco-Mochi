class Calculator
{
    //method that returns the sum between 2 numbers
    public int sum(int num1, int num2)
    {
        return num1 + num2;
    }

    //method with no return
    public void hello()
    {
        System.out.println("Hello!");
    }
}

public class CalcolatriceProva
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        calc.hello();
        int res = calc.sum(5, 3);
        
        System.out.println("The sum between 5 and 3 is: " + res);
    }
}
