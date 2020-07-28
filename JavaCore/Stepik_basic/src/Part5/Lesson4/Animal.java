package Part5.Lesson4;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals;
        int animalsCount;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            animalsCount = objectInputStream.readInt();

            animals = new Animal[animalsCount];
            int i = 0;
            while (i < animalsCount)
                animals[i++] = (Animal) objectInputStream.readObject();
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException("Указанный массив байт не является корректным представлением массива экземпляров Animal", e);
        }
    }

    public static void main(String[] args) {
        final int SIZE = 3;
        Animal[] animals = new Animal[SIZE];

        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeInt(SIZE);
            objectOutputStream.writeObject(new Animal("Animal 1"));
            objectOutputStream.writeObject(new Animal("Animal 2"));
            objectOutputStream.writeObject(new Animal("Animal 3"));
            animals = deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Animal animal : animals)
            System.out.println(animal);
    }
}
