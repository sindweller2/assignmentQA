package soal8;

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
            Integer[] x = new Integer[10];
            Scanner scanner = new Scanner(System.in);

            for (Integer y = 0; y < 10; y++)
            {
                System.out.println("input number " + (y + 1) + " : ");
                x[y] = scanner.nextInt();
            }

            System.out.println("output : ");

            for (Integer y = 0; y < 10; y++)
            {
                System.out.println(x[y]);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
