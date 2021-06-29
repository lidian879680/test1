package com.ld.test.algorithm;

import java.util.Arrays;

/**
 * @author lidian1
 * @description todo
 * @date 2021/6/15 19:14
 **/
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{49, 38, 65, 97, 76, 13, 27, 49, 78};
        //构建堆
        HeapSort heapSort = new HeapSort();
        for (int i= arr.length / 2 - 1; i >= 0; i--) {
            heapSort.buildBigHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >=0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapSort.buildBigHeap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @param i
     */
    private void buildBigHeap(int[] arr, int i, int len) {
        int childIndex = 0;
        while (true) {
            int tmp = arr[i];
            childIndex = 2 * i + 1;
            //没有子节点，结束
            if (childIndex >= len) {
                return;
            }
            //如果有右边子节点，取两个子节点最大的
            if (childIndex + 1 < len && arr[childIndex] < arr[childIndex + 1]) {
                childIndex++;
            }
            //子节点都比父节点小，不用转换
            if (arr[childIndex] <= tmp) {
                return;
            }
            //父子节点转换。
            arr[i] = arr[childIndex];
            arr[childIndex] = tmp;
            i = childIndex;
        }
    }
}
