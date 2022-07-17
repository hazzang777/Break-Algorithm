package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String ox = sc.next();
            int sum = 0;
            int add = 1;
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    sum += add;
                    add++;
                } else {
                    add = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
