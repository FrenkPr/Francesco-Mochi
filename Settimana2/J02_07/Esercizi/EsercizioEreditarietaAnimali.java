import java.util.ArrayList;

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
    //constructor method
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
    //constructor method
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
    //constructor method
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
    //instance variables declaration
    ArrayList<ArrayList<Animal>> animalsPerRow;
    ArrayList<String> animalTypes;

    //constructor method
    public Zoo()
    {
        animalsPerRow = new ArrayList<>();
        animalTypes = new ArrayList<>();
    }

    //addd an amount of a certain animal to the list
    public void addAnimals()
    {
        //local variables declaration & init
        int numAnimalsToInsert = 0;
        String animalType = "";
        ArrayList<Animal> zooAnimals = null;

        //numAnimalsToInsert input
        System.out.println("Insert the number of animals you want to add");
        numAnimalsToInsert = GlobalScanner.readIntInput();

        //if the input is not valid
        while(numAnimalsToInsert <= 0)
        {
            System.out.println("Insert a valid number");
            numAnimalsToInsert = GlobalScanner.readIntInput();
        }

        //creates an array list of animals with the capacity equal to numAnimalsToInsert
        zooAnimals = new ArrayList<>(numAnimalsToInsert);

        //animalType input
        System.out.println("Insert the type of animal you want to add (Cat, Dog, Parrot)");
        animalType = GlobalScanner.readStringInput();

        //if the input is not valid
        while(!animalType.equalsIgnoreCase("cat") &&
              !animalType.equalsIgnoreCase("dog") &&
              !animalType.equalsIgnoreCase("parrot"))
        {
            System.out.println("Insert a valid type of animal: Cat, Dog, Parrot");
            animalType = GlobalScanner.readStringInput();
        }

        //stores the animal type
        animalTypes.add(animalType);

        //input variables declaration & init
        String animalName = "";
        int animalAge = 0;

        for (int i = 0; i < numAnimalsToInsert; i++)
        {
            //animalName input
            System.out.println("Insert the name of the animal n."  + (i + 1));
            animalName = GlobalScanner.readStringInput();

            //if the input is not valid
            while (animalName.isEmpty())
            {
                System.out.println("Insert a valid name");
                animalName = GlobalScanner.readStringInput();
            }

            //animalAge input
            System.out.println("Insert the age of the animal");
            animalAge = GlobalScanner.readIntInput();

            //if the input is not valid
            while(animalAge < 0)
            {
                System.out.println("Insert a valid number");
                animalAge = GlobalScanner.readIntInput();
            }

            //adds a new animal to the list based on the animal type
            switch(animalType.toLowerCase())
            {
                case "cat":
                    zooAnimals.add(new Cat(animalName, animalAge));
                    break;

                case "dog":
                    zooAnimals.add(new Dog(animalName, animalAge));
                    break;

                case "parrot":
                    zooAnimals.add(new Parrot(animalName, animalAge));
                    break;
            }
        }

        //adds all the animals of the chosen category to the list
        animalsPerRow.add(zooAnimals);
    }

    //prints out all zoo animals
    public void printAnimalData()
    {
        for (int i = 0; i < animalsPerRow.size(); i++)
        {
            System.out.println("ANIMAL TYPE: " + animalTypes.get(i));
            
            for (Animal animal : animalsPerRow.get(i))
            {
                animal.printData();
            }
        }
    }
}

public class EsercizioEreditarietaAnimali
{
    public static void main(String[] args)
    {
        //scanner inputs init
        GlobalScanner.InitScannerInputs();

        ArrayList<Animal> animals = new ArrayList<>();
        Zoo zoo = new Zoo();

        animals.add(new Cat("Silvestro", 4));
        animals.add(new Cat("Tigre", 6));
        animals.add(new Cat("Leo", 2));
        animals.add(new Dog("Osso", 7));
        animals.add(new Dog("Taki", 3));

        for (int i = 0; i < animals.size(); i++)
        {
            animals.get(i).printData();
        }

        //adding animals to the zoo
        zoo.addAnimals();
        zoo.addAnimals();
        zoo.addAnimals();

        //prints out all animal data
        zoo.printAnimalData();

        //close scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}
