package Part5.Lesson3;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] chars = new char[1024];
        while (inputStreamReader.read(chars) != -1) {
            stringBuilder.append(new String(chars).trim());
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        byte[] bytes = new byte[]{48, 49, 50, 51};
        InputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            System.out.println(readAsString(byteArrayInputStream, StandardCharsets.US_ASCII));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
