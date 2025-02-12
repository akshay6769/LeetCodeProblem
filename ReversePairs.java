public class ReversePairs {
    public static int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > 2 * nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 3, 2, 3, 1 };
        int result = reversePairs(nums);
        System.out.println(result);
    }
}
