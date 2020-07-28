package Part10.Lesson6.p2;

import Part10.Lesson6.p1.*;

public class c1 {
    protected class InnerC1 implements p1 {

        public void functionP1() {
            System.out.println("functionP1 in " + getClass().getSimpleName());
        }
    }

    public InnerC1 getInner() {
        return new InnerC1();
    }
}
