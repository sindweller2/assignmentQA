package soal9;

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
            Animal animal = new Animal();

            animal.display();
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
