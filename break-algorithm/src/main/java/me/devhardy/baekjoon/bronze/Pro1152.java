package me.devhardy.baekjoon.bronze;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Pro1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        long count = Arrays.stream(words).filter(s -> !Objects.equals(s, "")).count();
        System.out.println(count);
    }
}
