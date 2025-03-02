package Util;

import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(List<Integer> arrList) {
        System.out.println(Arrays.toString(arrList.toArray()));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
