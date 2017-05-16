package soal3;

/**
 * Created by daniel on 5/15/17.
 */
public class Formula
{
    public Double triangle(Double x, Double y)
    {
        try
        {
            Double z = (x * y) / 2;
            return z;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
