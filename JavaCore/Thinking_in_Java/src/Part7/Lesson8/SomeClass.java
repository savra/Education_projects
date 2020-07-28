package Part7.Lesson8;

public class SomeClass extends SomeClassBase{
    SomeClass(){
        super("sss");
        System.out.println("Constructor SomeClass");
    }
    SomeClass(String s)
    {
        super(s);
    }

    public static void main(String[] args)
    {
        SomeClass s = new SomeClass();
    }

}

class SomeClassBase{
    SomeClassBase(String s)
    {
        System.out.println("Constructor SomeClassBase");
    }
}
