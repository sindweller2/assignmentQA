package soal1;

/**
 * Created by daniel on 5/15/17.
 */
public class AllString
{
    public String combineString(String x, String y, String z)
    {
        try
        {
            String words = x + " " + y + " " + z;
            return words;
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
