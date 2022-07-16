package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
