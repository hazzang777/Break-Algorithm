package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int result = 0;
        for (String s : split) {
            int num = Integer.parseInt(s);
            result += num * num;
        }
        System.out.println(result%10);
    }
}
