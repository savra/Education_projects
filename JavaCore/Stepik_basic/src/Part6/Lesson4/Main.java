package Part6.Lesson4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String strTest1 = "Мама мыла-мыла-мыла раму!";
        String strTest2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        BufferedReader bf = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strTest1.getBytes()), StandardCharsets.UTF_8));
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        List<StringBuilder> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        Stream<String> stringStream = bf.lines();
     //   stringStream.flatMap(s -> s.chars().filter(Character::isLetterOrDigit).map(Character::toLowerCase).forEach(stringBuilder::appendCodePoint)).collect(Collectors.toList());
     //   InputStream
    }
}
