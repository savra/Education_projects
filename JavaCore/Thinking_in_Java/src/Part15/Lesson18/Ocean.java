package Part15.Lesson18;

import Part15.Lesson7.Generator;

import java.util.*;

public class Ocean {
    public static void eat(BigFish t, LittleFish c) {
        System.out.println(t + " eats " + c);
    }

    public static void main(String[] args) {
        Random rn = new Random();
        Queue<BigFish> bigFishes = new LinkedList<>();
        Generators.fill(bigFishes, BigFish.generator(), 10);
        List<LittleFish> littleFishList = new ArrayList<>();
        Generators.fill(littleFishList, LittleFish.generator, 10);

        for(BigFish bigFish : bigFishes)
            eat(bigFish, littleFishList.get(rn.nextInt(littleFishList.size())));
    }
}
