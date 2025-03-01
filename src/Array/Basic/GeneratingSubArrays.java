package Array.Basic;

public class GeneratingSubArrays {
    // Iterative approach
    public static void generateSubArrays(int[] arr) {
        int n = arr.length;
        // Picking start index
        for (int i = 0; i < n; i++) {
            // Picking end index
            for (int j = i; j < n; j++) {
                // Print all
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Recursive approach
    public static void generateSubArrays(int[] a, int start, int end) {
        if (end == a.length) {
            return;
        } else if (start > end) {
            generateSubArrays(a, 0, end + 1);
        } else {
            for (int i = start; i < end; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println(a[end]);
            generateSubArrays(a, start + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        generateSubArrays(arr, 0, 0);
    }
}
