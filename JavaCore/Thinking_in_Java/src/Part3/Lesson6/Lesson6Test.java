package Part3.Lesson6;

public class Lesson6Test {

    public static void main(String[] args)
    {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "spot";
        spot.says = "say spot";
        scruffy.name = "scruffy";
        scruffy.says = "say scruffy";

        System.out.println("spot.name = " + spot.name + ", spot.says = " + spot.says + "\nscruffy.name = " + scruffy.name + ", scruffy.says = " + scruffy.says);

        Dog d1 = new Dog();
        spot = d1;

        System.out.println(scruffy == spot);
        System.out.println(d1 == spot);

        System.out.println(d1.equals(spot));
        System.out.println(spot.equals(d1));
    }
}
