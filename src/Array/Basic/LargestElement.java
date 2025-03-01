package Array.Basic;

import S00_DataStructureAlgorithms.Util.ArrayUtils;

public class LargestElement {
    // An iterative approach
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // A recursive approach
    static int findMax(int[] a, int i) {
        // Last index return the element
//        System.out.println("i: " + i);
        if (i == a.length - 1) {
            return a[i];
        }
        // Find the maximum from the rest of the array
        int recMax = findMax(a, i + 1);
//        System.out.println("Recursive max " + i + ": " + recMax);
        return Math.max(recMax, a[i]);
    }

    public static int findLargest2(int[] arr) {
        return findMax(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {5,8,3,9,12,67,23,100,89,45,34,37,49,11,10,15,20,68};
        ArrayUtils.printArray(arr);
        System.out.println("The largest element of this array is " + findLargest2(arr));
    }
}
