package Array.Basic;

import Util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    // Naive Approach: Using a temporary array - O(n) Time and O(n) Space
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = arr[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tmp[i];
        }
        return arr;
    }

    // Expected Approach 1: Using two pointers - O(n) Time and O(1) Space
    public static int[] reverseArray(int[] a, int left, int right) {
        while (left < right) {
            ArrayUtils.swap(a, left, right);
            left++;
            right--;
        }
        return a;
    }

    // Expected Approach 2 - By swapping elements - O(n) Time and O(1) Space
    public static int[] reverseArray2(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            ArrayUtils.swap(a, i, n - i - 1);
        }
        return a;
    }

    // Alternate Approach - Using Recursion - O(n) Time and O(n) Space
    public static void reverseArray2(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        ArrayUtils.swap(a, left, right);
        reverseArray2(a, left + 1, right - 1);
    }

    // Use In-Built method - Collection.reverse
    public static void reverseArray(List<Integer> a) {
        Collections.reverse(a);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
        reverseArray(list);
        ArrayUtils.printArray(list);
    }
}
