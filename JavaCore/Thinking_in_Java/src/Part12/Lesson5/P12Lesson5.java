package Part12.Lesson5;

import java.util.Random;

public class P12Lesson5 {
    public static void main(String[] args) {
        int[] mass = new int[2];
        Random rn = new Random();
        int i = 5;

        while (i >= 0) {
            try {
                mass[i] = 1 + rn.nextInt(4);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException catched");
            } finally {
                System.out.println("Finally!");
                i--;
            }
        }


    }
}
