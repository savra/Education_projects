package Part12.Lesson26;

import java.io.FileInputStream;
import java.io.IOException;

public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}
