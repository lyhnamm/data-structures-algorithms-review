package Array.Basic;

import Util.ArrayUtils;

public class SelectionSort {
    // Implementation Selection Sort
    public static void sort(int[] arr) {
        // Determine the length of the array
        int n = arr.length;
        // Loop through every element
        for (int i = 0; i < n - 1; i++) {
            // Declare index to store index of the minimum
            int min_idx = i;
            // Find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            ArrayUtils.swap(arr, min_idx, i);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 100, 12, 43, 23, 100, 99, 601, 34, 37, 49, 11, 10, 15, 20, 68};
        System.out.print("Original Array: ");
        ArrayUtils.printArray(arr);
        sort(arr);
        System.out.print("Sorted Array: ");
        ArrayUtils.printArray(arr);
    }
}