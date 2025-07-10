interface IShape
{
    public void draw();
}

abstract class ShapeCreator
{
    public abstract IShape createShape(String type);
}

class ConcreteCircleCreator extends ShapeCreator
{
    public IShape createShape(String type)
    {
        return type.equalsIgnoreCase("circle") ? new Circle() : null;
    }
}

class ConcreteSquareCreator extends ShapeCreator
{
    public IShape createShape(String type)
    {
        return type.equalsIgnoreCase("square") ? new Square() : null;
    }
}

// class ShapeCreatorStrategy
// {
//     private ShapeCreator shapeGeneratorType;

//     public ShapeCreatorStrategy(ShapeCreator shapeGeneratorType)
//     {
//         this.shapeGeneratorType = shapeGeneratorType;
//     }

//     //changes shape generator strategy
//     public void setShapeGeneratorType(ShapeCreator shapeGeneratorType)
//     {
//         this.shapeGeneratorType = shapeGeneratorType;
//     }

    
// }

class Circle implements IShape
{
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}

class Square implements IShape
{
    public void draw()
    {
        System.out.println("Drawing a square");
    }
}

public class EsercizioShapeFactory
{
    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables, instance variables declaration & init
        int menuOption = 0;

        do
        {
            //menu description
            System.out.println("\nChoose which operations you want to excute:");
            System.out.println("1: insert a shape");
            System.out.println("0: exit");

            //menu input
            menuOption = GlobalScanner.readIntInput("", false);
            // System.out.print("\n");

            switch(menuOption)
            {
                //option 1
                case 1:
                    String shapeType = "";
                    shapeType = GlobalScanner.readStringInput("Insert vehicle type (circle, square)", false);

                    IShape insertedShape = null;
                    ShapeCreator shapeGenerator = null;
                    
                    switch(shapeType.toLowerCase())
                    {
                        case "circle":
                            shapeGenerator = new ConcreteCircleCreator();
                            insertedShape = shapeGenerator.createShape(shapeType);

                            insertedShape.draw();
                            break;

                        case "square":
                            shapeGenerator = new ConcreteSquareCreator();
                            insertedShape = shapeGenerator.createShape(shapeType);

                            insertedShape.draw();
                            break;

                        default:
                            System.out.println("Insert a valid shape");
                            break;
                    }

                    break;

                //exit
                case 0:
                    break;

                //menu input not available
                default:
                    System.out.println("Insert a valid option");
                    break;
            }
        }
        while(menuOption != 0);

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}