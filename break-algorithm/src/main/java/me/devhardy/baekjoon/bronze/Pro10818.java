package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro10818 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        sc.close();
        max = numArr[0];
        min = numArr[0];

        for (int i : numArr) {
            if (max < i) {
                max = i;
            }

            if (min > i) {
                min = i;
            }
        }

        System.out.println(min + " " + max);

    }
}

/**
 * N개의 정수가 주어진다.
 * 첫 번째 - N
 * 공백으로 구분하여 N개 만큼의 정수를 입력
 * 반복문을 돈다.
 * 최소 최대 출력
 */
