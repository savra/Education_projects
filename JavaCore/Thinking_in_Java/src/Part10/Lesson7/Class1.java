package Part10.Lesson7;

public class Class1 {
    private String str = "aaa";

    private void function1() {
        System.out.println("Iam private function1");
    }

    private void function2() {
        InnerClass1 i = new InnerClass1();
        i.functionInner();
    }

    private void function3() {

    }

    @Override
    public String toString() {
        return str;
    }


    class InnerClass1 {
        public String str2 = "aaa";
        void functionInner()
        {
            str = "bbb";
        }
    }

    public static void main(String[] args) {
        Class1 c1 = new Class1();
        System.out.println(c1);
        c1.function2();
        System.out.println(c1);
    }
}
