package Array.Basic;

import Util.ArrayUtils;

public class InsertionSort {
    // Implement Insertion sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Insert element into right position in sorted array
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Main method fot testing
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 100, 12, 43, 23, 100, 99, 601, 34, 37, 49, 11, 10, 15, 20, 68};
        System.out.print("Original Array: ");
        ArrayUtils.printArray(arr);
        sort(arr);
        System.out.print("Sorted Array: ");
        ArrayUtils.printArray(arr);
    }
}
