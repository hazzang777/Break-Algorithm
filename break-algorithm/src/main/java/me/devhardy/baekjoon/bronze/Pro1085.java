package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = new int[4];
        arr[0] = x;
        arr[1] = w-x;
        arr[2] = y;
        arr[3] = h - y;

        int min = arr[0];

        for (int a : arr) {
            if (min > a) {
                min = a;
            }
        }

        System.out.println(min);
    }
}
