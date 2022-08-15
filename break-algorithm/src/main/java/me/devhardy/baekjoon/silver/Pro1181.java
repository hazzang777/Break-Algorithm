package me.devhardy.baekjoon.silver;

import java.util.Scanner;

public class Pro1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = sc.next();
        }

        sort(words);

        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String[] sort(String[] words) {
        String[] sortedWords = new String[words.length];

        return null;
    }
}
