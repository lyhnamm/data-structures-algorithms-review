package Array.Basic;

import S00_DataStructureAlgorithms.Util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertingArray {
    // Approach 1: Using an array, add element means shifting right remaining elements to right
    public static int[] insertX(int[] arr, int x, int pos) {
        if (pos < 1 || pos > arr.length + 1) {
            return arr;
        }
        // Give an array n-length. Create a new array with n+1 elements;
        int[] newArr = new int[arr.length + 1];

        // Copy elements from an old array to a new array
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < pos - 1) {
                newArr[i] = arr[i];
            } else if (i == pos - 1) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    // Approach 2: Using array list
    public static Integer[] insertElement(Integer[] a, int x, int pos) {
        // Convert array to an arrayList
        List<Integer> aLst = new ArrayList<>(Arrays.asList(a));

        // Add a new element to arrayList
        aLst.add(pos - 1, x);

        // Convert to an array again
        a = aLst.toArray(new Integer[aLst.size()]);
        return a;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayUtils.printArray(a);
        Integer[] b = insertElement(a, 10, 5);
        ArrayUtils.printArray(b);
    }
}
