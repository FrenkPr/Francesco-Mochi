import java.util.ArrayList;
// import UtilityClasses.*;

class Animal
{
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void makeSound()
    {
        System.out.println("Generic sound....");
    }

    public void printData()
    {
        System.out.print("Animal name: " + name + "\nage: " + age + "\nanimal sound: ");
        makeSound();
    }
}

class Cat extends Animal
{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Miao!");
    }
}

class Dog extends Animal
{
    public Dog(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Bau!");
    }
}

class Parrot extends Animal
{
    public Parrot(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Fiiiiiii!");
    }
}

class Zoo
{
    ArrayList<ArrayList<Animal>> animalsPerRow;

    public Zoo()
    {
        animalsPerRow = new ArrayList<>();
    }
}

public class EsercizioEreditarietaAnimali
{
    public static void main(String[] args)
    {
        // GlobalScanner.InitScannerInputs();

        ArrayList<Animal> animals = new ArrayList<>();
        Zoo animalZoo = new Zoo();

        animals.add(new Cat("Silvestro", 4));
        animals.add(new Cat("Tigre", 6));
        animals.add(new Cat("Leo", 2));
        animals.add(new Dog("Osso", 7));
        animals.add(new Dog("Taki", 3));

        for (int i = 0; i < animals.size(); i++)
        {
            animals.get(i).printData();
        }
    }
}
