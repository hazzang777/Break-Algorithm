package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextInt() + "";
        String b = sc.nextInt() + "";

        int num1 = reverseNum(a);
        int num2 = reverseNum(b);
        System.out.println(Math.max(num1, num2));
    }

    public static int reverseNum(String strNum) {
        char[] chars = new char[3];
        StringBuilder result = new StringBuilder();
        chars[0] = strNum.charAt(strNum.length() - 1);
        chars[1] = strNum.charAt(1);
        chars[2] = strNum.charAt(0);

        for (char c : chars) {
            result.append(Character.toString(c));
        }
        return Integer.parseInt(result.toString());
    }
}
