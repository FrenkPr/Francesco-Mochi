public class WhileEsempio
{
    public static void main(String[] args)
    {
        //index init
        int i = 1;


        while(i <= 5)
        {
            //post index increase
            i++;

            //index print
            System.out.println(i);

            // //all-in-one alternative with pre index increase
            // System.out.println(++i);
        }
    }
}
