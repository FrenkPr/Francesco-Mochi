/*
    ESERICIZIO 1: Ereditarietà ed Oggetti
    Traccia: 
    Crea una classe base Veicolo con gli attributi marca, modello e anno.
    Crea una sottoclasse Auto che eredita da Veicolo e aggiunge l'attributo numeroPorte.
    Crea una sottoclasse Moto che eredita da Veicolo e aggiunge l'attributo tipoManubrio.
    Implementa un metodo toString() in tutte le classi per stampare le informazioni del veicolo.
    Crea un programma principale che istanzia un oggetto Auto e un oggetto Moto, e stampa le loro informazioni.
 */

class Motorcycle extends Vehicle
{
    private String handlebarType;

    public Motorcycle(String brand, String model, int year, String handlebarType)
    {
        super(brand, model, year);
        this.handlebarType = handlebarType;

        vehicleName = "Motorcycle";
    }

    @Override
    public String toString()
    {
        return super.toString() + "handlebar type: " + handlebarType;
    }
}

class Auto extends Vehicle
{
    private int numDoors;

    public Auto(String brand, String model, int year, int numDoors)
    {
        super(brand, model, year);
        this.numDoors = numDoors;

        vehicleName = "Auto";
    }

    @Override
    public String toString()
    {
        return super.toString() + "number of doors: " + numDoors;
    }
}

class Vehicle
{
    private String brand;
    private String model;
    private int year;
    protected String vehicleName;

    public Vehicle(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;

        vehicleName = "Vehicle";
    }

    @Override
    public String toString()
    {
        return vehicleName + " brand: " + brand + "\nmodel: " + model + "\nyear: " + year + "\n";
    }
}

public class VeicoliMain
{
    public static void main(String[] args)
    {
        Auto auto = new Auto("Ford", "Fiesta", 2000, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CRF 450", 2010, "Comfort");

        System.out.println(auto);
        System.out.println(motorcycle);
    }
}
