package Part8.Lesson9;

import java.util.Random;

public class Rodent {
    @Override
    public String toString() {
        return "I am Rodent";
    }

    protected void voice() {
        System.out.println("Rodent speak");
    }

    private static Rodent genNext() {
        Random rn = new Random();
        switch (rn.nextInt(2)) {
            default:
            case 0:
                return new Hamster();
            case 1:
                return new Mouse();
        }
    }

    public static void main(String[] args) {
        Rodent[] rodArray = new Rodent[5];

        for (int i = 0; i < rodArray.length; i++)
            rodArray[i] = Rodent.genNext();

        for (Rodent item : rodArray) {
            System.out.println(item.toString());
            item.voice();
        }

        Mouse m = new Mouse();

        Hamster[] rodA = new Hamster[] {
            new Hamster(m),
            new Hamster(m),
            new Hamster(m),
            new Hamster(m),
            new Hamster(m)
        };

        for(Hamster item : rodA)
            item.dispose();
    }
}
