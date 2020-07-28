package Part5.Lesson2;

import java.io.*;

public class Test {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        for (int i = inputStream.read(); i != -1; i = inputStream.read())
            result = Integer.rotateLeft(result, 1) ^ i;

        return result;
    }

    public static void main(String[] args) {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01});

        //InputStream inputStream = new ByteArrayInputStream(new byte[]{});
        try {
            int result = checkSumOfStream(inputStream);
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}
