package Part7.Lesson15.Protected2;

import Part7.Lesson15.Protected1.A;

public class B extends A {

    void gg() {
        f();
    }
    public static void main(String[] args){
        B hh = new B();
        hh.f();

    }
}
