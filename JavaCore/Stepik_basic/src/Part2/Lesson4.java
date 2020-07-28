package Part2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson4 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int resultSize = a1.length + a2.length;
        int[] result = new int[resultSize];
        for (int i = 0, j = 0, k = 0; k < resultSize; k++) {
            if (j == a2.length)
                result[k] = a1[i++];
            else if (i == a1.length)
                result[k] = a2[j++];
            else {
                if (a1[i] < a2[j]) {
                    if (i + 1 < a1.length) {
                        result[k] = a1[i++];
                    } else if (i + 1 == a1.length) {
                        result[k] = a1[i++];
                    }
                } else {
                    if (j + 1 < a2.length) {
                        result[k] = a2[j++];
                    } else if (j + 1 == a2.length) {
                        result[k] = a2[j++];
                    }
                }
            }
        }
        return result;
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        int stringNumber;
        String dd;
        java.util.regex.Pattern pattern;
        java.util.regex.Matcher matcher;
        for (String role : roles) {
            result.append(role).append(":");
            result.append("\n");
            for (stringNumber = 0; stringNumber < textLines.length; stringNumber++) {
                pattern = java.util.regex.Pattern.compile("^" + role + ":", java.util.regex.Pattern.CASE_INSENSITIVE);
                matcher = pattern.matcher(textLines[stringNumber]);
                if (matcher.find()) {
                    result.append(stringNumber + 1).append(")").append(textLines[stringNumber].substring(matcher.end()));
                    result.append("\n");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2}, new int[]{1, 3, 6, 7})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2, 9, 11}, new int[]{1, 3, 6, 7})));
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, textLines));
    }
}
