package codewars;

import java.util.Arrays;

public class Task2 {
    String p = "foo7";
    String o = "foo";

    public static void main(String[] args) {
        System.out.println(change("iii2 fd1d fdfd8"));
    }

    private static String change(String words) {
        String[] wordsToOrder = words.split(" ");
        String[] newOrder = new String[wordsToOrder.length];
        for (int i = 1; i < wordsToOrder.length; i++) {
            String letter = String.valueOf(i);
            if (wordsToOrder[i].contains(letter)) {
                newOrder[i] = wordsToOrder[i];
            }
        }
        return String.join(" ", newOrder);
    }
}
