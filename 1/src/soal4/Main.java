package soal4;

/**
 * Created by daniel on 5/15/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Boolean x = (1 > 2 || 3 < 4);
            Boolean y = (5 * 6 == 7) && (8/9 != 1);
            Boolean z = (2 % 3 >= 4);

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
