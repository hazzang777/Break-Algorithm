package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
    }
}
