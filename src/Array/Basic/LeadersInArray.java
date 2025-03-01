package Array.Basic;

import Util.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Given an array arr[] of size n, the task is to find all the Leaders in the array.
    An element is a Leader if it is greater than or equal to all the elements to its right side.
 */
public class LeadersInArray {
    // Naive approach: Using nested loops - O(n^2) Time and O(1) Space
    public static List<Integer> getLeaders(int[] nums) {
        // Initialize an array to store result
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        // Nested loop
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    break;
                }
            }
            if (j == n) {
                leaders.add(nums[i]);
            }
        }
        return leaders;
    }

    // Efficient approach: Using suffix maximum - O(n) Time and O(1) Space
    public static List<Integer> getLeadersV2(int[] nums) {
        // Initialize an array list to store results
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        // Right-most element is always a leader
        int leader = nums[n - 1];
        leaders.add(leader);

        // Loop through an array
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > leader) {
                leader = nums[i];
                leaders.add(leader);
            }
        }

        // Reverse the result
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = getLeadersV2(arr);
        ArrayUtils.printArray(leaders);
    }
}
