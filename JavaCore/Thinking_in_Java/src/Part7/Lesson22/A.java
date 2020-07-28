package Part7.Lesson22;

public  class A {
    int a = 5;
}


class B extends A{

int a = 6;


public static void main(String ... args){
    A b = new B();
    System.out.println(b);

}
}
