package soal1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String x, y, z;
            AllString allString = new AllString();
            Scanner scanner = new Scanner(System.in);

            System.out.println("input : ");

            x = scanner.next();
            y = scanner.next();
            z = scanner.next();

            System.out.println("output : " + allString.combineString(x, y, z));
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
