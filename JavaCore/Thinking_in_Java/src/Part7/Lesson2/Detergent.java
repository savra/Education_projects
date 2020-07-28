package Part7.Lesson2;

public class Detergent extends Cleanser {
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam()
    {
        append(" foam()");
    }

    public static void main(String ... args)
    {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();

        System.out.println(x);
        Cleanser.main(args);
    }
}

class SomeClass extends Detergent
{
    public void scrub()
    {
        append(" SomeClass.scrub()");
        super.scrub();
    }

    void sterilize()
    {
        System.out.println("Sterialize");
    }

    public  static void main(String ... args)
    {
        SomeClass s = new SomeClass();
        s.dilute();
        s.apply();
        s.scrub();
        s.sterilize();

        System.out.println(s);
    }
}
