package Part11.Lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Its gerbilNumber " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> al = new ArrayList<Gerbil>();

        for(int i = 1; i <= 10; i++)
        al.add(new Gerbil(i));

        for(Gerbil item : al) {
            item.hop();
        }
    }
}
