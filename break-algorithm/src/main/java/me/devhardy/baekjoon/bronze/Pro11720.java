package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String str = scanner.next();
        int result = 0;
        scanner.close();
        for (int i = 0; i < count; i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
