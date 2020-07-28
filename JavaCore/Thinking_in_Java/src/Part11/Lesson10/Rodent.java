package Part11.Lesson10;

import java.lang.reflect.Array;
import java.util.*;

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
        ArrayList<Rodent> rodArray = new ArrayList<>();

        rodArray.add(Rodent.genNext());
        rodArray.add(Rodent.genNext());
        rodArray.add(Rodent.genNext());
        rodArray.add(Rodent.genNext());
        rodArray.add(Rodent.genNext());

        Iterator<Rodent> iterator = rodArray.iterator();

        while (iterator.hasNext()) {
            Rodent currentObject = iterator.next();
            System.out.println(currentObject.toString());
            currentObject.voice();
        }

        Mouse m = new Mouse();

        ArrayList<Hamster> rodA = new ArrayList<>();
        rodA.add(new Hamster());
        rodA.add(new Hamster());
        rodA.add(new Hamster());
        rodA.add(new Hamster());
        rodA.add(new Hamster());
        rodA.add(new Hamster());

        Iterator<Hamster> iterator2 = rodA.iterator();

        while (iterator2.hasNext()) {
            Hamster currentObject = iterator2.next();
            System.out.println(currentObject.toString());
            currentObject.voice();
        }

    }
}
