import java.util.ArrayList;

class Auto
{
    //instance variables declaration
    public String trademark;
    public int year;

    public Auto(String trademark, int year)
    {
        this.trademark = trademark;
        this.year = year;
    }
}

public class ArrayListAutoProva
{
    public static void main(String[] args)
    {
        ArrayList<Auto> myAuto = new ArrayList<>();

        myAuto.add(new Auto("Seat Ibiza", 2016));
        myAuto.add(new Auto("Toyota Yaris", 2020));

        System.out.println("AUTO LIST:");

        for (Auto auto : myAuto)
        {
            System.out.println(auto.trademark + " - " + auto.year);
        }
    }
}
