public class AtletaEsercizioValoriRandom
{
    public static void main(String[] args)
    {
        //variables initialization
        int athleteAge = (int)(Math.random() * (90 - 18)) + 18;
        float bestTimeOn100Metres = (float)(Math.random() * (200.0f - 5.0f)) + 5.0f;
        float athleteWeight = (float)(Math.random() * (160.0f - 40.0f)) + 40.0f; //Kg
        float athleteHeight = (float)(Math.random() * (2.2f - 1.2f)) + 1.2f; //metres

        float bmi = 0.0f;

        bmi = athleteWeight / (float)Math.pow(athleteHeight, 2);

        System.out.println("Athlete age: " + athleteAge);
        System.out.println("Athlete weight: " + athleteWeight);
        System.out.println("Athlete height: " + athleteHeight);
        System.out.println("Best time on 100 metres: " + bestTimeOn100Metres);
        System.out.println("BMI: " + bmi);

        if(athleteAge <= 18 && athleteAge >= 40 && bestTimeOn100Metres < 12.0f && bmi < 25.0f)
        {
            System.out.println("Admitted to the competition");
        }

        else
        {
            System.out.println("Not admitted to the competition");
        }
    }
}
