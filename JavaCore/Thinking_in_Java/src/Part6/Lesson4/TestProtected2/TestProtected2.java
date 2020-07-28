package Part6.Lesson4.TestProtected2;

import Part6.Lesson4.TestProtected1.TestProtected1;

public class TestProtected2 {
    public static void main(String ... args)
    {
        TestProtected1 tp1 = new TestProtected1();
        tp1.field1 = 5;
        //tp1.field2 = 5; default
        //tp1.field3 = 5; protected
        //tp1.field4 = 5; private

        tp1.f1();
        //tp1.f2(); default
        //tp1.f3(); protected
        //tp1.f4(); private
    }

}
