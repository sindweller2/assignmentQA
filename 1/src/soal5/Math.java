package soal5;

/**
 * Created by daniel on 5/15/17.
 */
public class Math
{
    public Integer square(Integer x)
    {
        try
        {
            Integer y = (x * x);
            return y;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
