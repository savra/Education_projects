package Part9.Lesson14;

public class ClassA extends ClassB implements A, B, C, D {

    public void a1() {}
    public void a2() {

    }
    public void b1() {}
    public void b2() {}

    public void c1() {}
    public void c2() {}

    public void d() {}

    public void classA(A a)
    {

    }

    public void classB(B b)
    {

    }

    public void classC(C c)
    {

    }
    public void classD(D d)
    {
    }

    @Override
    public void classBC(ClassB e) {}

    public static void main(String ... args) {
        ClassA a = new ClassA();
        a.classA(new ClassA());
        a.classB(new ClassA());
        a.classC(new ClassA());
        a.classD(new ClassA());
        a.classBC(new ClassA());
    }
}

abstract class ClassB {
    abstract void classBC(ClassB e);
}