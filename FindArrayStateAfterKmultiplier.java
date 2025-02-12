import java.util.*;

class FindArrayStateAfterKmultiplier {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;

        // Perform k operations
        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            // Find the index of the minimum value
            for (int j = 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Multiply the minimum value by the multiplier
            nums[minIndex] *= multiplier;
        }

        return nums;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 1, 3, 5, 6 };
        int k = 5;
        int multiplier = 2;
        int[] result = getFinalState(nums, k, multiplier);
        for (int value : result) {
            System.out.print(value + "");
        }
        System.out.println();
    }

}
