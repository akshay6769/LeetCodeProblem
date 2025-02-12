public class KadaneMaximumSubarraySumOptimal {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxi = nums[0]; // Start with the first element as the maximum

        for (int i = 0; i < n; i++) {
            // Update sum to either the current element or the current element + sum
            sum = Math.max(nums[i], sum + nums[i]);
            // Update maxi to track the maximum sum encountered so far
            maxi = Math.max(maxi, sum);
        }

        return maxi; // Return the maximum subarray sum
    }

    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(nums); // Corrected: result is an int, not an array
        System.out.println(result); // Print the result
    }
}
