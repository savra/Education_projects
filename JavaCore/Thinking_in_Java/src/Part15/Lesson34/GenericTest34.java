package Part15.Lesson34;

public abstract class GenericTest34<T extends GenericTest34<T>> {

    abstract T f1(T a);

    T f2(T a) {
        System.out.println("not abstract method");
        return f1(a);
    }


}


class GenericTest34Sub extends GenericTest34<GenericTest34Sub> {
    GenericTest34Sub f1(GenericTest34Sub a) {
        System.out.println("f1 derived class");
        return  new GenericTest34Sub();
    }

    public static void main(String[] args) {
        GenericTest34Sub kk = new GenericTest34Sub();
        kk.f1(kk).f2(kk);
    }
}