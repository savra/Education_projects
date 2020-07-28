package Part11.Lesson15;

import java.util.LinkedList;

public class StackTest {
    private final LinkedList<Character> stack;

    StackTest() {
        stack = new LinkedList<>();
    }

    static void translate(String str) {
        StackTest s = new StackTest();
        char[] resultStr = str.toCharArray();
        for (int i = 0; i < resultStr.length; i++) {
            if (resultStr[i] == '+')
                s.stack.push(resultStr[i + 1]);
            else if (resultStr[i] == '-'){
                System.out.println(s.stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        final String s = "+U+n+c---+e+r+t--+a-+i-+n+t+y---+o-+r+u--+l+e+s---";
        StackTest.translate(s);
    }
}
