//context state
class FitnessStateManager
{
    private static FitnessState currentState;

    public static void setCurrentState(FitnessState switchingState)
    {
        currentState = switchingState;
    }

    public static void runCurrentState()
    {
        //it doesn't execute any state if currentState equal to null
        if(currentState == null)
        {
            return;
        }

        currentState.update();
    }
}

interface FitnessState
{
    public void update();
}

class TrainingState implements FitnessState
{
    public void update()
    {
        try
        {
            System.out.println("TRAINING STATE");
            Thread.sleep(1000);
            
            System.out.println("Doing push up");
            Thread.sleep(700);

            System.out.println("Doing muscle up");
            Thread.sleep(700);

            System.out.println("Doing chin up");
            Thread.sleep(700);

            System.out.println("Switching to next state");
            Thread.sleep(500);

            FitnessStateManager.setCurrentState(new RestState());
            FitnessStateManager.runCurrentState();
        }

        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class RecoveryState implements FitnessState
{
    public void update()
    {
        try
        {
            System.out.println("RECOVERY STATE");
            Thread.sleep(1000);
            
            System.out.println("Breath 1");
            Thread.sleep(700);

            System.out.println("Breath 2");
            Thread.sleep(700);

            System.out.println("Breath 3");
            Thread.sleep(700);

            System.out.println("Switching to next state");
            Thread.sleep(500);

            FitnessStateManager.setCurrentState(new TrainingState());
            FitnessStateManager.runCurrentState();
        }

        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class RestState implements FitnessState
{
    public void update()
    {
        try
        {
            System.out.println("REST STATE");
            Thread.sleep(1000);
            
            System.out.println("Breathing..........");
            Thread.sleep(700);

            System.out.println("States ended.\nEnding program");
            Thread.sleep(1000);
        }

        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class Es3AppFitness
{
    public static void main(String[] args)
    {
        FitnessStateManager.setCurrentState(new RecoveryState());
        FitnessStateManager.runCurrentState();
    }
}
