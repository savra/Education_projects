package Part11.Lesson29;

import java.util.PriorityQueue;

public class A {
    public static void main(String[] str){
        PriorityQueue<A> pr = new PriorityQueue<>();
        pr.offer(new A());
      /*  pr.offer(new A());
        pr.offer(new A());
        pr.offer(new A()); need comparator*/
    }
}
