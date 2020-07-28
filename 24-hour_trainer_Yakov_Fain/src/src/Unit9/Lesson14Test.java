package Unit9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Lesson14Test {
    public static void main(String[] args) {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("./src/src/Unit9/TestArchive.zip"))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                System.out.println(zipEntry.getName());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}
