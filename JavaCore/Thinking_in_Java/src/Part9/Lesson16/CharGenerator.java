package Part9.Lesson16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharGenerator implements Readable {
    private int count = 0;
    private static Random rn = new Random(58);

    private static final int MAX_CHAR_LENGTH = 10;

    public CharGenerator(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }

        for (int i = 0; i < MAX_CHAR_LENGTH - 1; i++)
            cb.append((char) (97 + rn.nextInt(122 - 97)));
        cb.append(" ");

        return MAX_CHAR_LENGTH;
    }

    public static void main(String... args) {

        Scanner s = new Scanner(new CharGenerator(5));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}

