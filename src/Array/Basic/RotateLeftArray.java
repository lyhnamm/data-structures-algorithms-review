package Array.Basic;

import Util.ArrayUtils;

public class RotateLeftArray {
    // 1st approach: Rotate one-by-one from right to left
    // The first element becomes the last
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        return arr;
    }

    // 2nd approach: Using a temp array
    public static int[] rotate2(int[] arr, int k) {
        int n = arr.length;
        int[] tmp = new int[n];
        int j = 0;
        for (int i = 0; i < n-k; i++) {
            tmp[j++] = arr[i+k];
        }
        for (int i = 0; i < k; i++) {
            tmp[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tmp[i];
        }
        return arr;
    }

    // 3rd approach: Using reversal algorithm
    public static int[] rotate3(int[] arr, int k) {
        int n = arr.length;
        ReverseArray.reverseArray(arr, 0, n-1);
        ReverseArray.reverseArray(arr, 0, n-k-1);
        ReverseArray.reverseArray(arr, n-k, n-1);
        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = {1,2,3};
        int[] a = rotate(arr, 4);
        ArrayUtils.printArray(a);
    }
}
