package Array.Basic;

import S00_DataStructureAlgorithms.Util.ArrayUtils;

import java.util.Arrays;

public class Searching {
    // Basic approach: Linear search
    public static int linearSearch(int[] a, int target) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Another appoach: Binary search using Iteration
    public static int binarySearch(int[] a, int target) {
        // First, sorting an input array
        Arrays.sort(a);
        ArrayUtils.printArray(a);
        int lo = 0, hi = a.length - 1, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (target < a[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    // Another approach: Binary search using Recursion
    public static int binarySearch(int[] a, int lo, int hi, int target) {
        // First, sort an array
        Arrays.sort(a);
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == target) {
                return mid;
            }
            // implement searching
            if (target < a[mid]) {
                return binarySearch(a, lo, mid - 1, target);
            } else {
                return binarySearch(a, mid + 1, hi, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Un-sorted array
        int[] arr = {5,8,3,9,12,67,23,100,89,45,34,37,49,11,10,15,20,68};
        int[] sortedArr = {1,2,3,4};
        int x = 34;
        Arrays.sort(arr);
        ArrayUtils.printArray(arr);
        System.out.println(binarySearch(arr, 0, arr.length, x));
    }
}
