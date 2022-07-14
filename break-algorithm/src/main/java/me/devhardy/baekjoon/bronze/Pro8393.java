package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i + 1;
        }
        System.out.println(result);
    }
}
