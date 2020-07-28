package Part8.Lesson10;

public class A {
    void B(){
        System.out.println("Its B in base class");
        C();
    }

    void C(){
        System.out.println("Its C in base class");
    }
}

class B extends A{
    @Override
    void C(){
        System.out.println("Its C in derivative class");
    }

    public static void main(String ... args){
        A a = new B();
        a.B();
    }
}
