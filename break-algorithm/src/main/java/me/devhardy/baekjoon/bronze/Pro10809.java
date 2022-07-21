package me.devhardy.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Pro10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] answer = new int[26];
        Arrays.fill(answer, -1);
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (answer[index] == -1) {
                answer[index] = i;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
