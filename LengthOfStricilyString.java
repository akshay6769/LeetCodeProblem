public class LengthOfStricilyString {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        int inclen = 1;
        int declen = 1;
        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                inclen++;
                declen = 1;
            } else if (nums[i] < nums[i - 1]) {
                declen++;
                declen = 1;
            } else {
                inclen = 1;
                declen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inclen, declen));
        }
        return maxLen;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 4, 3, 3, 2 };
        LengthOfStricilyString obj = new LengthOfStricilyString();
        int result = obj.longestMonotonicSubarray(nums);
        System.out.println(result);
    }
}
