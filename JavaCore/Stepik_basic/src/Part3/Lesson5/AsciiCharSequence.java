package Part3.Lesson5;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte[] charSequence;

    private static final int CAPACITY = 10;


    public AsciiCharSequence(byte[] charSequence) {
        if (charSequence == null)
            this.charSequence = new byte[CAPACITY];
        else
            this.charSequence = charSequence;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(charSequence, start, end));
    }

    @Override
    public int length() {
        return charSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) charSequence[index];
    }

    @Override
    public String toString() {
        return new String(charSequence);
    }


    public static void main(String... args) {
        AsciiCharSequence charSequence = new AsciiCharSequence(new byte[]{83, 65, 86, 82, 65});
        System.out.println("Последовательность: " + charSequence.toString());
        System.out.println("Символ под указанным индексом: " + charSequence.charAt(3));
        System.out.println("Длина последовательности: " + charSequence.length());
        System.out.println("Часть последовательности: " + charSequence.subSequence(0, 3));

    }
}
