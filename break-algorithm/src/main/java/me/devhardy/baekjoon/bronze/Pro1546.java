package me.devhardy.baekjoon.bronze;

import java.util.Scanner;

public class Pro1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double[] arr = new double[count];
        double max = 0;
        double sum = 0d;
        // 초기화 및 max값
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextDouble();

            if (i == 0){
                max = arr[i];
            }else{
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
       // max
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }

        System.out.println(sum/count);


    }
}
