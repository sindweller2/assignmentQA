package soal2;

import java.util.Scanner;

/**
 * Created by daniel on 5/15/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String x;
            Scanner scanner = new Scanner(System.in);

            System.out.println("input 1st : ");
            x = scanner.next();

            System.out.println("input 2nd : ");
            x = scanner.next();

            System.out.println("output : " + x);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
