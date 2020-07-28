package Part7.Lesson16;

public class Amphibian {

    void methodA() {
        System.out.println("methodA Amphibian");
    }
    void methodB() {
        System.out.println("methodB Amphibian");
    }
    void methodC() {
        System.out.println("methodC Amphibian");
    }

    public static void main(String ... args)
    {
        Frog frog1 = new Frog();

        frog1.methodA();
        frog1.methodB();
        frog1.methodC();

        Amphibian a = new Amphibian();
        a.methodA();
        a.methodB();
        a.methodC();

        a = frog1;

        a.methodC();
        a.methodB();
        a.methodA();
    }
}

class Frog extends Amphibian{
    @Override
    void methodA(){
        System.out.println("methodA Frog");
    }

    @Override
    void methodB() {
        System.out.println("methodB Frog");
    }

    @Override
    void methodC() {
        System.out.println("methodC Frog");
    }
}
