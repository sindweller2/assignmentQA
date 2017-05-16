package soal9;

/**
 * Created by daniel on 5/15/17.
 */
public class Animal
{
    Boolean isAlive;
    String name;
    Integer age;

    public Animal()
    {
        isAlive = true;
        name = "crocodile";
        age = 7;
    }

    public void display()
    {
        System.out.println(isAlive + " " + name + " " + age);
    }
}
