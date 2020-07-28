package Part16.Lesson1;

import org.jetbrains.annotations.NotNull;

public class BerylliumSphere implements Comparable<BerylliumSphere>{
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(@NotNull BerylliumSphere o) {
        return this.id < o.id ? -1 : (this.id > o.id ? 1 : 0);
    }
}
