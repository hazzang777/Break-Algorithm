package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Integer[] x = new Integer[42];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            int reserve = arr[i] % 42;
            x[reserve] = reserve;
        }

        for (Integer a : x) {
            if (a != null) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}

/**
 *  10개의 수를 입력 받는다. -> 배열 필요
 *  나머지를 구한다 -> 배열필요
 *  순회하면서 -> 서로 다른 숫자를 count를 센다
 *
 */
