package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArr = SortUtil.randArr(6);
        System.out.println("Before: " + SortUtil.toString(testArr));
        long time = System.nanoTime();
        SelectSort.sort(testArr);
        time = System.nanoTime() - time;
        System.out.println("After: " + SortUtil.toString(testArr));
        System.out.println("Time: " + time);
    }
}
