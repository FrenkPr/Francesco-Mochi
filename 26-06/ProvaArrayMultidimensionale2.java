public class ProvaArrayMultidimensionale2
{
    public static void main(String[] args)
    {
        //variables init
        int[][] numsMatrix = new int[3][3];
        int value = 1;

        //fills numsMatrix with the increasing "value" variable
        for (int numRow = 0; numRow < numsMatrix.length; numRow++)
        {
            for (int numCol = 0; numCol < numsMatrix[numRow].length; numCol++)
            {
                numsMatrix[numRow][numCol] = value++;
            }
        }

        //prints out the matrix
        System.out.print("{ ");

        for (int numRow = 0; numRow < numsMatrix.length; numRow++)
        {
            for (int numCol = 0; numCol < numsMatrix[numRow].length; numCol++)
            {
                if(numCol == 0)
                {
                    System.out.print("{ ");
                }

                System.out.print(numsMatrix[numRow][numCol]);

                //prints out the ',' separator for each col element
                if(numCol != numsMatrix[numRow].length - 1)
                {
                    System.out.print(", ");
                    continue;
                }

                //prints out the final graph separator of each row
                System.out.print(" },\n");
            }
        }

        System.out.println(" }");
    }
}
