package Array.Basic;

import S00_DataStructureAlgorithms.Util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestThree {
    // Naive approach: Three traversals
    public static List<Integer> getLargestThree(int[] nums) {
        // Initialize an array list to store result
        List<Integer> res = new ArrayList<>();
        int fst = Integer.MIN_VALUE, scd = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;
        // 1st loop to find the largest
        for (int num : nums) {
            if (num > fst) {
                fst = num;
            }
        }
        // 2nd loop to find the second largest
        for (int num : nums) {
            if (num > scd && num != fst) {
                scd = num;
            }
        }
        // 3rd loop to find the third largest
        for (int num : nums) {
            if (num > thd && num != scd && num != fst) {
                thd = num;
            }
        }

        // Return result
        if (fst == Integer.MIN_VALUE)
            return res;
        res.add(fst);
        if (scd == Integer.MIN_VALUE)
            return res;
        res.add(scd);
        if (thd == Integer.MIN_VALUE)
            return res;
        res.add(thd);
        return res;
    }

    // Efficient approach: One traversal
    public static List<Integer> getLargestThreeV2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int fst = Integer.MIN_VALUE, scd = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > fst) {
                thd = scd;
                scd = fst;
                fst = nums[i];
            } else if (nums[i] > scd && nums[i] < fst) {
                thd = scd;
                scd = nums[i];
            } else if (nums[i] > thd && nums[i] < scd) {
                thd = nums[i];
            }
        }
        if (fst == Integer.MIN_VALUE)
            return res;
        res.add(fst);
        if (scd == Integer.MIN_VALUE)
            return res;
        res.add(scd);
        if (thd == Integer.MIN_VALUE)
            return res;
        res.add(thd);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        ArrayUtils.printArray(arr);
        Arrays.sort(arr);
        ArrayUtils.printArray(arr);
        List<Integer> res = getLargestThree(arr);
        for (Integer num : res) {
            System.out.print(num + " ");
        }
    }
}
