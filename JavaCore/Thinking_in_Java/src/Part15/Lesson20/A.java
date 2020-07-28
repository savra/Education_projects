package Part15.Lesson20;

public class A implements I {
    private double doubleValue;

    A(double someValue) {
        doubleValue = someValue;
    }

    public void f2(){
        System.out.println("Method f2 " + doubleValue);
    }

    public String f3() {
        System.out.println("Method f3 " + doubleValue);
        return "Method f3";
    }

    private double f4() {
        System.out.println("Method f4" + doubleValue);
        return 0.5;
    }
}
