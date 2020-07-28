package Part3.Lesson7;

import java.util.Random;

public class ThrowCoin {
    public static void main(String[] args)
    {
        Random rn = new Random();

        boolean value = rn.nextBoolean();

        System.out.println(value ? "Орел" : "Решка");
    }
}
