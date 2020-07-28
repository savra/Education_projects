package Part16.Lesson18;

import Part16.Lesson1.BerylliumSphere;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays18 {


    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

        for(BerylliumSphere berylliumSphere : berylliumSpheres)
            System.out.println(berylliumSphere);
        System.out.println("----------");

        BerylliumSphere[] berylliumSpheres1 = berylliumSpheres;
        for(BerylliumSphere berylliumSphere : berylliumSpheres1)
            System.out.println(berylliumSphere);


        berylliumSpheres1[0] = new BerylliumSphere();

        System.out.println("----------");
        for(BerylliumSphere berylliumSphere : berylliumSpheres1)
            System.out.println(berylliumSphere);
        System.out.println("----------");
        for(BerylliumSphere berylliumSphere : berylliumSpheres)
            System.out.println(berylliumSphere);

        System.out.println("+++++++++++++");

        BerylliumSphere[] berylliumSpheresSORT = {new BerylliumSphere(), berylliumSpheres1[1], new BerylliumSphere()};

        for(BerylliumSphere berylliumSphere : berylliumSpheresSORT)
            System.out.println(berylliumSphere);

        Arrays.sort(berylliumSpheresSORT);

        System.out.println("SORT +++++++++++++");

        for(BerylliumSphere berylliumSphere : berylliumSpheresSORT)
            System.out.println(berylliumSphere);

        System.out.println("SORT reverse +++++++++++++");
        Arrays.sort(berylliumSpheresSORT, new Comparator<BerylliumSphere>() {
            @Override
            public int compare(BerylliumSphere o1, BerylliumSphere o2) {
                return o1.getId() < o2.getId() ? 1 : (o1.getId() > o2.getId() ? -1 : 0 ) ;
            }
        });

        for(BerylliumSphere berylliumSphere : berylliumSpheresSORT)
            System.out.println(berylliumSphere);

    }
}
