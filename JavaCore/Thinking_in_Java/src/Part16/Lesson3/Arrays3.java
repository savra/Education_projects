package Part16.Lesson3;

import Part16.Lesson1.BerylliumSphere;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Random;

public class Arrays3 {
    private double[][][] result;

    void f(int n, int start, int end) {
        result = new double[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++)
                    result[i][j][k] = Math.random() * (end - start) + start;
            }
        }
    }

    void f2() {
        if (result != null)
            for (int i = 0; i < result.length; i++)
                for (int j = 0; j < result[i].length; j++)
                    for(int k = 0; k < result[i][j].length; k++)
                    System.out.println(new Formatter().format("Array element with index [%d][%d][%d] = %f", i, j, k, result[i][j][k]));
    }

    static BerylliumSphere[][][] f3(int n1, int n2, int n3) {
        BerylliumSphere[][][] berylliumSpheres = new BerylliumSphere[n1][n2][n3];
        for(int i = 0; i < n1; i++)
            for(int j = 0; j < n2; j++)
                for(int k = 0; k < n3; k++)
                berylliumSpheres[i][j][k] = new BerylliumSphere();
            return berylliumSpheres;
    }

    public static void main(String[] args) {
        BerylliumSphere[][][] berylliumSpheres = f3(3, 4, 2);
        System.out.println(Arrays.deepToString(berylliumSpheres));
    }
}