package Part16.Lesson19;

import java.util.Arrays;
import java.util.Objects;

public class Arrays19 {
    private int someValue;

    Arrays19(int someValue) {
        this.someValue = someValue;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.someValue == ((Arrays19) obj).someValue;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(someValue);
    }

    public static void main(String[] args) {
        Arrays19[] arrays19s1 = {new Arrays19(1), new Arrays19(2), new Arrays19(3)};
        Arrays19[] arrays19s2 = {new Arrays19(1), new Arrays19(2), new Arrays19(3)};

        Arrays19[][] arrays19s1_3d = {
                {new Arrays19(1), new Arrays19(2), new Arrays19(3)},
                {new Arrays19(4), new Arrays19(5), new Arrays19(6)}
        };

        Arrays19[][] arrays19s2_3d = {
                {new Arrays19(1), new Arrays19(2), new Arrays19(3)},
                {new Arrays19(4), new Arrays19(5), new Arrays19(6)}
        };

        System.out.println(Arrays.equals(arrays19s1, arrays19s2));
         //deepEquals
        System.out.println(Arrays.deepEquals(arrays19s1_3d, arrays19s2_3d));
    }
}
