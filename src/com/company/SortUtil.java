package com.company;

public class SortUtil {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] randArr(int count) {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = (int)(Math.random()*1001);
        }
        return arr;
    }
    public static String toString(int[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1) {
                str += ", ";
            }
        }
        return str;
    }
    public static int NextMin(int[] arr, int ind) {
        int temp = ind;
        for (int i = ind + 1; i < arr.length; i++) {
            if(arr[i] < arr[temp]) {
                temp = i;
            }
        }
        return temp;
    }
}
