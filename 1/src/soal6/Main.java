package soal6;

/**
 * Created by daniel on 5/15/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            for (Integer x = 100; x >= 0; x--)
            {
                System.out.println(x);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
