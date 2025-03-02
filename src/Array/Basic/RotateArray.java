package Array.Basic;

import Util.ArrayUtils;

import java.util.Arrays;

public class RotateArray {
    // 1st approach: Rotate one-by-one
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        // Loop k times
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    // 2nd approach: Using a temp array
    public static int[] rotate2(int[] arr, int k) {
        int n = arr.length;
        // Initial a temp array
        int[] temp = new int[n];
        int j = 0;
        // Copy last k elements from an original to a temp array
        for (int i = 0; i < k; i++) {
            temp[j++] = arr[n-k+i];
        }
        // Copy n - k remaining elements from an original to a temp array
        for (int i = 0; i < n - k; i++) {
            temp[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    // 3rd approach: Reversal algorithm
    public static int[] rotate3(int[] arr, int k) {
        int n = arr.length;
        // Reverse all array
        ReverseArray.reverseArray(arr, 0, n-1);
        // Next, reverse the first k elements, from 0 to k-1
        ReverseArray.reverseArray(arr, 0, k-1);
        // Finally, reverse n - k remaining elements
        ReverseArray.reverseArray(arr, k, n-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] b = rotate(arr, 2);
        ArrayUtils.printArray(b);
    }
}
