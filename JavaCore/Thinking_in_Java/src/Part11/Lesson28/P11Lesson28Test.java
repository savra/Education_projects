package Part11.Lesson28;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class P11Lesson28Test {
    public static void main(String[] args) {
        PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>();

        Random rn = new Random();
        for (int i = 0; i < 10; i++)
            doublePriorityQueue.offer(2 + rn.nextDouble() * 8);

        for(int i = 0; i < doublePriorityQueue.size(); i++)
            System.out.println(doublePriorityQueue.poll());
    }
}
