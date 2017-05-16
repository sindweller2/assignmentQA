package soal7;

/**
 * Created by daniel on 5/15/17.
 */
public class Math
{
    public String oddEven(Integer x)
    {
        try
        {
            String y;

            if (x % 2 == 0)
            {
                y = "Even";
            }
            else
            {
                y = "Odd";
            }

            return y;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
