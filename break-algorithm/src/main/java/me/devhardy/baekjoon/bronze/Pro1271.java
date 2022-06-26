package me.devhardy.baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Pro1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger money = sc.nextBigInteger();
        BigInteger lifeCnt = sc.nextBigInteger();

        System.out.println(money.divide(lifeCnt));
        System.out.println(money.remainder(lifeCnt));
    }
}
