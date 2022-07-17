package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[8];
        boolean isSorted = false;
        int tempNum = 0;
        boolean tempSorted = false;
        for (int i = 0; i < 8; i++) {
            numArr[i] = sc.nextInt();
        }
        tempNum = numArr[0];

        for (int i = 1; i < 8; i++) {
            if (tempNum < numArr[i]) {
                tempNum = numArr[i];
                isSorted = true;
            }

            if (tempNum > numArr[i]) {
                tempNum = numArr[i];
                isSorted = false;
            }

            if (i >= 2) {
                if (isSorted != tempSorted) {
                    System.out.println("mixed");
                    return;
                }
            }
            tempSorted = isSorted;
        }

        if (isSorted) {
            System.out.println("ascending");
        } else{
            System.out.println("descending");
        }

    }
}
