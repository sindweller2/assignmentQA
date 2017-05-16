package soal5;

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
            Integer x;
            Scanner scanner = new Scanner(System.in);
            Math math = new Math();

            System.out.println("input number : ");
            x = scanner.nextInt();

            System.out.println("output : " + math.square(x));
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
