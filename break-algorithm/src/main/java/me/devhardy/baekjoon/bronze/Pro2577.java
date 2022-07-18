package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = a * b * c + "";
        int[] arr = new int[]{0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < result.length(); i++) {
            switch (result.charAt(i)) {
                case '0':
                    arr[0] += 1;
                    break;
                case '1':
                    arr[1] += 1;
                    break;
                case '2':
                    arr[2] += 1;
                    break;
                case '3':
                    arr[3] += 1;
                    break;
                case '4':
                    arr[4] += 1;
                    break;
                case '5':
                    arr[5] += 1;
                    break;
                case '6':
                    arr[6] += 1;
                    break;
                case '7':
                    arr[7] += 1;
                    break;
                case '8':
                    arr[8] += 1;
                    break;
                default:
                    arr[9] += 1;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
