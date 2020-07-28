package Part16.Lesson2;

import Part16.Lesson1.BerylliumSphere;

public class Arrays2 {
    public static BerylliumSphere[] f(int n) {
        BerylliumSphere[] result = new BerylliumSphere[n];
        for (int i = 0; i < n; i++) {
            result[i] = new BerylliumSphere();
        }

        return result;
    }

    public static void main(String[] args) {
        BerylliumSphere[] array = f(10);
        for (BerylliumSphere item : array)
            System.out.println(item);
    }
}
