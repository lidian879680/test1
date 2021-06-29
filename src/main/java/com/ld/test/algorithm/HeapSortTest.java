package com.ld.test.algorithm;

import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{49, 38, 65, 97, 76, 13, 27, 49, 78};
        for (int i= arr.length/2-1;i>=0;i--) {
            HeapSortTest.buildBigHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void buildBigHeap(int[] arr, int i, int len) {
        int tmp = arr[i];
        while (true) {
            int childPos = 2 * i + 1;
            if (childPos >= len) {
                return;
            }
            if (childPos + 1 < len && arr[childPos] < arr[childPos + 1]) {
                childPos++;
            }
            if (tmp < arr[childPos]) {
                arr[i] = arr[childPos];
                arr[childPos] = tmp;
                i = childPos;
            } else {
                return;
            }
        }
    }
}
