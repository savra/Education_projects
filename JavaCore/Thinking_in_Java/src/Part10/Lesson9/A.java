package Part10.Lesson9;

public class A {

    MyInterface someFunction() {
        class MyInnerClass implements MyInterface {
            public void functionInterface() {
                System.out.println("void functionInterface();");
            }
        }
        return new MyInnerClass();
    }

    public static void main(String[] args) {
        A f = new A();
        MyInterface mi = f.someFunction();
        mi.functionInterface();
    }
}
