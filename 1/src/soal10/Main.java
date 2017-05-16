package soal10;

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
            Animal animal;

            animal = new Dog();
            animal.bark();

            animal = new Cat();
            animal.meow();
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
