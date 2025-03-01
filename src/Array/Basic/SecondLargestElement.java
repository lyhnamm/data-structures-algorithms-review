package Array.Basic;

import Util.ArrayUtils;

import java.util.Arrays;

public class SecondLargestElement {
    // Naive approach: Sort an array and then find the first element not equals to the largest element.
    public static int getSecondLargestElement(int[] arr) {
        // Sort an array in non-decrease order
        Arrays.sort(arr);
        int n = arr.length;
        // Find the largest element
        int largest = arr[n - 1];
        // Loop to find the first element not equals to the largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return -1;
    }

    // Better approach: Use twice loops
    public static int getSecondLargestElement2(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        // 1st loop - to find the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        // 2nd loop - to find the second-largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Expected approach: Use loop once, when find the largest, update largest and second-largest simultaneously
    public static int getSecondLargestElement3(int[] arr) {
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        // Loop
        for (int i = 0; i < n; i++) {
            // If arr[i] > largest, update second largest with largest, and update largest with arr[i]
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            }
            // If arr[i] > second largest and arr[i] < largest, update second largest with arr[i]
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 9, 3, 9, 9, 6, 4, 5, 7};
        int[] arr = {5,8,3,100,12,67,23,100,99,100,34,37,49,11,10,15,20,68};
        ArrayUtils.printArray(arr);
        System.out.println(getSecondLargestElement3(arr));
    }
}
