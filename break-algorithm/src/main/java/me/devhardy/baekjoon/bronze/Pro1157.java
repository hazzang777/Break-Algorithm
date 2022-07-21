package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] arr = new int[26];
        String upperWord = word.toUpperCase();
        // 중복 되는 만큼 확인
        for (int i = 0; i < upperWord.length(); i++) {
            int index = upperWord.charAt(i) - 'A';
            arr[index]++;
        }

        int max = 0;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer = (char) (i + 'A');
            } else if (max == arr[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}

/**
 * 문자열 입력 받음
 * 문자열 순회하며 같은 문자열이 나오는 순간 그 해당 문자열과 반복횟수를 넣는다.
 * 여러개가 있으면 -> ?
 * 아니면 -> 해당 문자 대문자로 출력
 */
