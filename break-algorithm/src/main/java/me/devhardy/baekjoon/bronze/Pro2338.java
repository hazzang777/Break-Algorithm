package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
