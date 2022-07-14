package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(result);
    }
}
