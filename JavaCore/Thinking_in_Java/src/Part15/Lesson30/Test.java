package Part15.Lesson30;

import Part15.Lesson29.Holder;

public class Test {
    public static void main(String[] args){
        Holder<Byte> byteHolder = new Holder<>();
        Holder<Short> shortHolder = new Holder<>();
        Holder<Character> characterHolder = new Holder<>();
        Holder<Integer> integerHolder = new Holder<>();
        Holder<Long> longHolder = new Holder<>();
        Holder<Float> floatHolder = new Holder<>();
        Holder<Double> doubleHolder = new Holder<>();

        byteHolder.set((byte) 1);
        System.out.println(byteHolder.get());

        shortHolder.set((short)2);
        System.out.println(shortHolder.get());

        characterHolder.set('a');
        System.out.println(characterHolder.get());

        integerHolder.set(3);
        System.out.println(integerHolder.get());

        longHolder.set(4L);
        System.out.println(longHolder.get());

        floatHolder.set(5f);
        System.out.println(floatHolder.get());

        doubleHolder.set(6D);
        System.out.println(doubleHolder.get());

    }
}
