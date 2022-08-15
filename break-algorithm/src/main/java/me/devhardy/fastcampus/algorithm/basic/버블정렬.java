package me.devhardy.fastcampus.algorithm.basic;

import java.util.ArrayList;
import java.util.Collections;

public class 버블정렬 {
    public static void main(String[] args) {
        ArrayList<Integer> dummy = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            dummy.add((int) (Math.random() * 100));
        }

        BubbleSort.sort(dummy);
        System.out.println(dummy);
    }
}

class BubbleSort{
    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j , j+1);
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }

        return list;
    }
}
