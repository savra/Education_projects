package Part6.Lesson2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputIntegers = new ArrayList<>();
        List<Integer> outputIntegers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
            inputIntegers.add(in.nextInt());

        if (inputIntegers.size() == 0)
            return;

        for (int i = 1, j = 0; i < inputIntegers.size(); i += 2, j++)
            outputIntegers.add(inputIntegers.get(i));

        Collections.reverse(outputIntegers);

        outputIntegers.forEach((x) -> System.out.print(x + " "));
    }
}
