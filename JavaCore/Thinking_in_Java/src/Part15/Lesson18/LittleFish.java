package Part15.Lesson18;

import Part15.Lesson7.Generator;

public class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator =
            new Generator<LittleFish>() {
                public LittleFish next() {
                    return new LittleFish();
                }
            };
}
