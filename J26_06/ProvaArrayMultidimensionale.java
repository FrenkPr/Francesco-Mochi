public class ProvaArrayMultidimensionale
{
    public static void main(String[] args)
    {
        //array 2D
        int[][] matrix = new int[3][3];

        //direct init
        int[][] matrixPredefined = {{ 10, 20, 30 },
                                    { 40, 50, 60 },
                                    { 70, 80, 90 }};

        System.out.println(matrixPredefined[0][0] + " " + matrixPredefined[1][1] + " " + matrixPredefined[2][2]);
    }
}
