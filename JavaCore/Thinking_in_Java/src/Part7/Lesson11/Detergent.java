package Part7.Lesson11;

public class Detergent {
    Cleanser c = new Cleanser();

    public void append(String a)
    {
        c.append(a);
    }

    public void dilute()
    {
        c.dilute();
    }

    public void apply()
    {
        c.apply();
    }

    public void scrub()
    {
        append(" Detergent.scrub()");
        c.scrub();
    }

    public String toString()
    {
        return c.toString();
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

class SomeClass
{
    Detergent d = new Detergent();

    public void append(String a)
    {
        d.append(a);
    }

    public void dilute()
    {
        d.dilute();
    }

    public void apply()
    {
        d.apply();
    }


    public void scrub()
    {
        append(" SomeClass.scrub()");
        d.scrub();
    }

    public String toString()
    {
        return d.toString();
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
