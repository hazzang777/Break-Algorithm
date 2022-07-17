package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            numArr[i] = sc.nextInt();
        }
        max = numArr[0];
        for (int j = 0; j < 9; j++) {
            if (max < numArr[j]) {
                max = numArr[j];
                index = j;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
