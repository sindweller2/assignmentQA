package soal3;

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
            Double x;
            Double y;
            Scanner scanner = new Scanner(System.in);
            Formula formula = new Formula();

            System.out.println("input height : ");
            x = scanner.nextDouble();

            System.out.println("input width : ");
            y = scanner.nextDouble();

            System.out.println("output : " + formula.triangle(x, y));
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
