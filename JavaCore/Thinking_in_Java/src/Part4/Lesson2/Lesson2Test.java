package Part4.Lesson2;

import java.util.Random;

public class Lesson2Test {

    public static void main(String[] args) {
        Random rn = new Random();

        int int1, int2;

        for (int i = 0; i < 25; i++) {
            int1 = rn.nextInt();
            int2 = rn.nextInt();

            if (int1 < int2)
                System.out.println(i + " " + int1 + " < " + int2);
            else if (int1 > int2)
                System.out.println(i + " " + int1 + " > " + int2);
            else
                System.out.println(i + " " + int1 + " = " + int2);
        }
    }
}
