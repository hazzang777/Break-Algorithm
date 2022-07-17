package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int repeatable = scanner.nextInt();
            String word = scanner.next();

            for (int j = 0; j < word.length(); j++) {
                for (int z = 0; z < repeatable; z++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }

    }
}

/**
 *
 * 첫 번째 줄 케이스 개수 입력
 * 개수 만큼 (반복횟수, 문자열)
 *
 *
 */