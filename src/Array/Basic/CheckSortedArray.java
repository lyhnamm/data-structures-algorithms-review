package Array.Basic;

import java.util.Arrays;

public class CheckSortedArray {
    // Iterative approach
    public static boolean isSortedArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Recursive approach
    public static boolean isSortedArray(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        return arr[n-1] >= arr[n-2] && isSortedArray(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {5,8,3,100,12,67,23,100,99,100,34,37,49,11,10,15,20,68};
        System.out.println(isSortedArray(arr, arr.length));
        Arrays.sort(arr);
        System.out.println(isSortedArray(arr, arr.length));
    }
}
