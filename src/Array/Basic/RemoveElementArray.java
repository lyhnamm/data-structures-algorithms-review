package Array.Basic;

import Util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveElementArray {
    // Appoach 1: Using an array
    public static int[] removeElementByIndex(int[] nums, int index) {
        int n = nums.length;
        // Create a new smaller array
        int[] newArr = new int[n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i == index) {
                continue;
            }
            newArr[k++] = nums[i];
        }
        return newArr;
    }

    // Approach 2: Using an array list
    public static Integer[] removeElement(Integer[] nums, int index) {
        // Convert array to an array list
        List<Integer> aLst = new ArrayList<>(Arrays.asList(nums));
        // Remove element by index
        aLst.remove(index);
        return aLst.toArray(new Integer[aLst.size()]);
    }

    public static int[] removeElement(int[] a, int in) {
        if (a == null || in < 0 || a.length <= in) {
            return a;
        }
        return IntStream.range(0, a.length)
                .filter(i -> i != in)
                .map(i -> a[i])
                .toArray();
    }

    public static void main(String[] args) {
        int[] a = {1,2,9,10,5};
        ArrayUtils.printArray(a);
        int[] b = removeElement(a, 3);
        ArrayUtils.printArray(b);
    }
}
