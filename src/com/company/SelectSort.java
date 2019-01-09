package com.company;

public class SelectSort {
    public static void sort(int[] arr) {
        int min;
        for(int i = 0; i < arr.length - 1; i++) {
            min = SortUtil.NextMin(arr, i);
            if (i != min) {
                SortUtil.swap(arr, i, min);
            }
        }
    }
}
