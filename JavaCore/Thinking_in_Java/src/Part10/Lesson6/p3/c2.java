package Part10.Lesson6.p3;

import Part10.Lesson6.p2.*;
import Part10.Lesson6.p1.*;

public class c2 extends c1 {


    public static void main(String[] args) {
        c1 c = new c1();
        p1 p = c.getInner();

     //нет доступа ибо протектед   p1 p2 = c.new InnerC1();


        p.functionP1();
    }
}
